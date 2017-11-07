package com.example.team1288.c2h6o;

import android.content.Context;

/**
 * Created by ssoso on 2017-08-31.
 */

public class DB_Makgeolli extends DB_Alcohol {
    // 생성자
    public DB_Makgeolli(Context context)
    {
        super(context, "makgeolliList");

        insertData();
    }

    // 데이터 입력
    private void insertData()
    {
//        insert("test술", 10, 1000, "테스트용 가데이터 입니다");
    }
}
