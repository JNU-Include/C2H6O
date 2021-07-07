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
        insert(R.drawable.makgeolli_jeju, "제주막걸리", "제주막걸리", 6.0, 0000, "");
        insert(R.drawable.makgeolli_soonhee, "순희막걸리", "순희막걸리", 6.0, 0000, "");
        insert(R.drawable.makgeolli_cheondoong, "천둥소리 생막걸리", "천둥소리 생막걸리", 6.0, 0000, "");
        insert(R.drawable.makgeolli_soonhee, "금정산성막걸리", "금정산성막걸리", 8.0, 0000, "");
        insert(R.drawable.makgeolli_goocksoondang, "국순당 쌀막걸리", "국순당 쌀막걸리", 4.0, 0000, "오리지널, 복숭아, 바나나, 유자, 크림치즈 맛이 있다.");
        insert(R.drawable.makgeolli_songsan, "송산포도 생막걸리", "송산포도 생막걸리", 6.0, 0000, "");
        insert(R.drawable.makgeolli_albam, "알밤동동", "톡쏘는 알밤동동", 6.0, 0000, "");
        insert(R.drawable.makgeolli_uja, "유자 생막걸리", "유자 생막걸리", 5.0, 0000, "");
    }
}
