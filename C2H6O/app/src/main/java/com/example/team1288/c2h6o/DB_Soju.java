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
        insert(R.drawable.soju_cham, "참이슬", "[서울] 참이슬", 17.8, 0000, "후레쉬(17.8%), 클래식(20.1%) 두 종류가 있다.");
        insert(R.drawable.soju_cheum, "처음처럼", "[강원] 처음처럼", 17.5, 0000, "");
        insert(R.drawable.soju_o2, "O₂린", "[충남] O₂린", 19.0, 0000, "");
        insert(R.drawable.soju_white, "하이트", "[전북] 하이트", 19.5, 0000, "");
        insert(R.drawable.soju_ip, "잎새주", "[전남] 잎새주", 19.5, 0000, "");
        insert(R.drawable.soju_c1, "C1", "[부산] C1", 17.5, 0000, "");
        insert(R.drawable.soju_hallasan, "한라산", "[제주] 한라산", 21.0, 0000, "오리지널(21.0%), 올레(18.0%) 두 종류가 있다.");
        insert(R.drawable.soju_the, "the 찾을수록", "the 찾을수록", 16.0, 1500, "레어 과실주 중 하나. \n과실주치곤 높은 도수이나, 강력한 과일향과 함께 달콤한 맛을 즐길 수 있다. \n사과, 감귤, 생강, 복숭아, 청포도, 아메리카노맛이 있다.");
//        insert("(과일)에 이슬");
//        insert("순하리 처음처럼");
//        insert("좋은데이");
    }
}
