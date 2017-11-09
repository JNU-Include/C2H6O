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
        // insert(picture, name, material, 0.0, 0, explain);
        insert(R.drawable.cocktail_ggulbingsu, "꿀막걸리 빙수", "막걸리 520ml, 꿀 80ml", 0.0, 0, "여기에 바닐라 아이스크림, 미숫가루, 빙수떡, 팥, 연유를 넣는다.\n" +
                "사실 대충 팥빙수스러운 건 대충 아무거나 넣어도 된다. 정량 따윈 필요없다.\n" +
                "맛은 뭔가 요거트 얼린 것 같다.");
    }
}
