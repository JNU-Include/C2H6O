package com.example.team1288.c2h6o;

import android.content.Context;

/**
 * Created by ssoso on 2017-08-31.
 */

public class DB_Soju extends DB_Alcohol {
    // 생성자
    public DB_Soju(Context context)
    {
        super(context, "sojuList");

        insertData();
    }

    // 데이터 입력
    private void insertData()
    {
//        insert("테스트alcohol", 20, 2000, "테스트를 위한 가짜 데이터 입니다.");
    }
}
