package com.example.team1288.c2h6o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import static android.content.ContentValues.TAG;

/**
 * Created by ssoso on 2017-08-28.
 */

public abstract class mainFragment extends Fragment implements AdapterView.OnItemClickListener {
    private SQLiteDatabase db;
    private final int choice;
    private static DB_Alcohol db_info = null;

    public mainFragment()
    {
        this.choice = 0;
    }

    public mainFragment(int choice)
    {
        this.choice = choice;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_layout, container, false);

        ListView listview = null;
        ListViewAdapter adapter = null;

        int icon = 0;

        switch (choice)
        {
            case 1 : // soju
                if (!(db_info instanceof DB_Soju)) db_info = new DB_Soju(getActivity());
                listview = (ListView) rootView.findViewById(R.id.alcoholList);
                icon = R.drawable.img_soju;
                break;

            case 2 : // beer
                if (!(db_info instanceof DB_Beer)) db_info = new DB_Beer(getActivity());
                listview = (ListView) rootView.findViewById(R.id.alcoholList);
                icon = R.drawable.img_beer;
                break;

            case 3 : // makgeolli
                if (!(db_info instanceof DB_Makgeolli)) db_info = new DB_Makgeolli(getActivity());
                listview = (ListView) rootView.findViewById(R.id.alcoholList);
                icon = R.drawable.img_makgeolli;
                break;

            case 4 : // cocktail
                if (!(db_info instanceof DB_Cocktail)) db_info = new DB_Cocktail(getActivity());
                listview = (ListView) rootView.findViewById(R.id.alcoholList);
                icon = R.drawable.img_cocktail;
                break;

            default:
                break;
        }

        db = db_info.getDB();
        Cursor cursor = db.rawQuery("SELECT * FROM " + db_info.getTableName(), null);

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview.setAdapter(adapter);

        // db에 저장된 data를 아이템으로 추가
        cursor.moveToFirst(); // 첫번째 row

        while (!cursor.isAfterLast())
        {
            int idNum = cursor.getInt(0);
            byte[] picture = cursor.getBlob(1);
            String name_kr = cursor.getString(2);
            String name_en = cursor.getString(3);
            double degree = cursor.getDouble(4);
            int price = cursor.getInt(5);
            String explain = cursor.getString(6);

            // add item
            adapter.addItem(ContextCompat.getDrawable(getActivity(), icon),
                    idNum, picture, name_kr, name_en, degree, price, explain, ContextCompat.getDrawable(getActivity(), R.drawable.ic_arrow)) ;

            cursor.moveToNext(); // 다음 row
        }
        cursor.close();

        Log.d(getClass().toString(), "db data 넣기 완료");

        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        listview.setOnItemClickListener(this);

        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // get item
        ListViewItem item = (ListViewItem) adapterView.getItemAtPosition(position) ;

        // name, degree, price, explain 을 넘겨주면서 detail_layout 페이지로 Fragment 교체
        Bundle args = new Bundle();

        args.putByteArray("byte_picture", item.getPicture());
        args.putString("str_name_kr", item.getNameKR());
        args.putString("str_name_en", item.getNameEN());
        args.putDouble("double_degree", item.getDegree());
        args.putInt("int_price", item.getPrice());
        args.putString("str_explain", item.getExplain());

        Fragment fragment = null;
        switch (choice)
        {
            case 1: // soju
                fragment = new Soju_detailFragment();
                break;

            case 2: // beer
                fragment = new Beer_detailFragment();
                break;

            case 3: // makgeolli
                fragment = new Makgeolli_detailFragment();
                break;

            case 4: // cocktail
                fragment = new Cocktail_detailFragment();
                break;

            default:
                break;
        }
        fragment.setArguments(args);

        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, fragment).commit();
    }
}
