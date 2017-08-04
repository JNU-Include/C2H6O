package com.example.team1288.c2h6o;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by ssoso on 2017-07-12.
 */

public class Beer_mainFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beer_main);
        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.beerlist);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_beer),
                "Cass", "15%", "1,500", ContextCompat.getDrawable(this, R.drawable.ic_arrow)) ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_beer),
                "Asahi", "15%", "1,500", ContextCompat.getDrawable(this, R.drawable.ic_arrow)) ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_beer),
                "Heineken", "15%", "1,500", ContextCompat.getDrawable(this, R.drawable.ic_arrow)) ;

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;

                String str_name = item.getName() ;
                String str_degree = item.getDegree() ;
                String str_price = item.getPrice();
                Drawable dr_icon = item.getIcon() ;
                Drawable dr_arrow = item.getArrow();

                // TODO : use item data.
            }
        }) ;
    }
}
