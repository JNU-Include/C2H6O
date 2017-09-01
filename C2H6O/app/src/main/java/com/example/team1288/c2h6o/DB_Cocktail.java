package com.example.team1288.c2h6o;

import android.content.Context;

/**
 * Created by ssoso on 2017-09-01.
 */

public class DB_Cocktail extends DB_Alcohol {
    // 생성자
    public DB_Cocktail(Context context)
    {
        super(context, "cocktailList");

        insertData();
    }

    // 데이터 입력
    private void insertData()
    {
        insert("칵테일테일", 10, 1000, "칵테일 테스트용 가데이터 입니다");
    }
}
