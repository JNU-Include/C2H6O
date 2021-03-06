package com.example.team1288.c2h6o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ssoso on 2017-07-18.
 * 참고 : http://recipes4dev.tistory.com/43
 */

public class ListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>() ;

    // ListViewAdapter의 생성자
    public ListViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView iv_icon = (ImageView) convertView.findViewById(R.id.alcohol_icon);
        TextView tv_name = (TextView) convertView.findViewById(R.id.alcohol_name);
        TextView tv_degree = (TextView) convertView.findViewById(R.id.alcohol_degree);
        TextView tv_price = (TextView) convertView.findViewById(R.id.alohol_price);
        ImageView iv_arrow = (ImageView) convertView.findViewById(R.id.btn_explain);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        ListViewItem listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        iv_icon.setImageDrawable(listViewItem.getIcon());
        tv_name.setText(listViewItem.getName());
        tv_degree.setText(listViewItem.getDegree() + "%");
        tv_price.setText(listViewItem.getPrice() + "원");
        iv_arrow.setImageDrawable(listViewItem.getArrow());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable icon, int idNum, String name, int degree, int price, String explain, Drawable arrow) {
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setIdNum(idNum);
        item.setName(name);
        item.setDegree(degree);
        item.setPrice(price);
        item.setExplain(explain);
        item.setArrow(arrow);

        listViewItemList.add(item);

        Log.e(getClass().toString(), idNum + "아이템 추가" + name);
    }

}
