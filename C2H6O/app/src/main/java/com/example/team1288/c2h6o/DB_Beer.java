package com.example.team1288.c2h6o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;

/**
 * Created by ssoso on 2017-08-04.
 */

// Beer database 생성 및 초기화
public class DB_Beer extends DB_Alcohol {

    // 생성자
    public DB_Beer(Context context)
    {
        super(context, "beerList");

        insertData();
    }

    // 데이터 입력
    private void insertData()
    {
//        insert("카스", 15, 1500, "이것은 카스이다...");
//        insert("하이트", 16, 1600, "나는 하이트가 실다....");
//        insert("맥스", 17, 1700, "맥스 왜먹냐 ㄹㅇ");
//        insert("하이네켄", 18, 1800, "하이네켄...병이..예쁘다...");
//        insert("삿포로", 19, 1900, "삿포로 별 존예임 ㄹㅇ");
//        insert("호가든", 20, 2000, "로제 마셔보고 싶다");
//        insert("호가든 로제", 21, 2100, "마셔보고 싶어서 넣어봤다");
//        insert("아사히", 22, 2200, "먹을만한데 좀 씀");
//        insert("아사히 드라이", 23, 2300, "아사히랑 다른건가?");
//        insert("산미구엘", 24, 2400, "비싸다 안먹어봤다");
//        insert("칭따오", 25, 2500, "양꼬치엔 칭따오!");
//        insert("코젤다크", 26, 2600, "흑맥주래;");
//        insert("바이드만 슈바르츠비어", 27, 2700, "흑맥주 밀맥주 구분란 넣을까...");
//        insert("크로넨버그 1664", 28, 2800, "이름 존나김");
//        insert("필스너 우르켈", 29, 2900, "그만 치고 싶다");
//        insert("베를리너 킨들 필스너", 30, 3000, "ㅇㅅㅇ");
//        insert("파울라너 헤페 바이스비어 나투르트륍", 31, 3100, "와씨발 왜 안마셔본 애들만 나옴");
//        insert("스텔라 아르투아", 32, 3200, "스뗄라");
//        insert("레벤브로이", 33, 3300, "그만하자...");

        insert(R.drawable.beer_cass, "카스", "Cass", 4.5, 2400, "이것은 카스이다...");
        insert(R.drawable.beer_hite, "하이트", "Hite", 4.5, 2400, "나는 하이트가 실다....");
        insert(R.drawable.beer_max, "맥스", "Max", 4.5, 2400, "맥스 왜먹냐 ㄹㅇ");
        insert(R.drawable.beer_heineken, "하이네켄", "Heineken", 5, 3900, "하이네켄...병이..예쁘다...");
//        insert("Sapporo", 19, 1900, "삿포로 별 존예임 ㄹㅇ");
        insert(R.drawable.beer_hoegaarden, "호가든", "Hoegaarden", 20, 2000, "국내 최초로 소개된 화이트 맥주. \n오렌지 껍질이 들어가 향긋하다.");
//        insert("Hoegaarden Rosse", 21, 2100, "마셔보고 싶어서 넣어봤다");
//        insert("Asahi", 22, 2200, "먹을만한데 좀 씀");
//        insert("Asahi Dry Black", 23, 2300, "아사히랑 다른건가?");
//        insert("San Miguel", 24, 2400, "비싸다 안먹어봤다");
//        insert("Tsingtao", 25, 2500, "양꼬치엔 칭따오!");
        insert(R.drawable.beer_kozel, "코젤 다크", "Kozel Dark", 26, 2600, "쌉싸래한 동시에 달콤한 맛이 특징인 흑맥주. \n최고의 맥주로 여덟 차례 선정되었다.");
//        insert("Weidann Schwarzbier", 27, 2700, "흑맥주 밀맥주 구분란 넣을까...");
//        insert("Kronenbourg 1664", 28, 2800, "이름 존나김");
//        insert("Pilsner Urguell", 29, 2900, "그만 치고 싶다");
//        insert("Berliner Kindl Pils", 30, 3000, "ㅇㅅㅇ");
//        insert("Paulaner", 31, 3100, "와씨발 왜 안마셔본 애들만 나옴");
//        insert("Stella Artois", 32, 3200, "스뗄라");
//        insert("Lowenbrau", 33, 3300, "그만하자...");
    }

}

