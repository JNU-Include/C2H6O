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
        insert(R.drawable.beer_cass, "카스", "Cass", 4.5, 2400, "고든 램지가 “죽이게 신선하네(bloody fresh). 훌륭한 맥주야.” “느끼함을 잡아준다. 톡 쏘고 신선하다” 라고 평한 국산 라거 맥주.");
        insert(R.drawable.beer_hite, "하이트", "Hite", 4.5, 2400, "숙성에서부터 여과까지 생산 전 공정을 맥주가 얼기 직전, 영하의 온도에서 제조하여 시원하고 청량한 페일라거 맥주 본연의 맛을 극대화시킨 국산 라거 맥주");
        insert(R.drawable.beer_max, "맥스", "Max", 4.5, 2400, "보리와 캐스캐이드 호프만을 사용한 100% 보리맥주로, 깊고 풍부한 맛과 싱그러운 호프의 향이 잘 조화됐다.");
        insert(R.drawable.beer_heineken, "하이네켄", "Heineken", 5.0, 3900, "세계 3위의 네덜란드 맥주 하이네켄은 특유의 투명한 황금색과 담백한 거품 맛으로 유명하다. 목 넘김은 가볍과 뒷맛은 묵직함을 느낄 수 있는 쓴맛이 난다. 홉 향이 은은하게 풍기며, 대표적인 라거 맥주다.");
//        insert("Sapporo", 19, 1900, "삿포로 별 존예임 ㄹㅇ");
        insert(R.drawable.beer_hoegaarden, "호가든", "Hoegaarden", 5.0, 2000, "국내 최초로 소개된 화이트 맥주. \n오렌지 껍질이 들어가 향긋하다.");
//        insert("Hoegaarden Rosse", 21, 2100, "마셔보고 싶어서 넣어봤다");
//        insert("Asahi", 22, 2200, "먹을만한데 좀 씀");
//        insert("Asahi Dry Black", 23, 2300, "아사히랑 다른건가?");
//        insert("San Miguel", 24, 2400, "비싸다 안먹어봤다");
//        insert("Tsingtao", 25, 2500, "양꼬치엔 칭따오!");
        insert(R.drawable.beer_kozel, "코젤 다크", "Kozel Dark", 3.8, 3900, "쌉싸래한 동시에 달콤한 맛이 특징인 흑맥주. 쓰고 진한 보통 흑맥주보다 맛이 부드럽다. \n최고의 맥주로 여덟 차례 선정되었다.");
//        insert("Weidann Schwarzbier", 27, 2700, "흑맥주 밀맥주 구분란 넣을까...");
//        insert("Kronenbourg 1664", 28, 2800, "이름 존나김");
//        insert("Pilsner Urguell", 29, 2900, "그만 치고 싶다");
//        insert("Berliner Kindl Pils", 30, 3000, "ㅇㅅㅇ");
        insert(R.drawable.beer_guinness, "기네스 드래프트", "Guinness draught", 4.2, 4300, "캔 속에 동그란 공 같은 '액화질소 위젯'이 들어있어 다른 흑맥주와 달리 부드러운 거품을 낸다. 다크 초콜릿과 코코아, 구운 보리의 향이 일품.");
        insert(R.drawable.beer_becks, "벡스", "Beck's", 5.0, 3700, "독일에서 가장 수출량이 많은 맥주. \n신선한 홉의 향과 약간의 단맛이 어우러져 기분 좋은 청량감을 느낄 수 있다.");
        insert(R.drawable.beer_paulaner, "파울라너 헤페바이스", "Paulaner", 5.5, 3000, "달달한 밀의 향과 바나나향, 약간의 감귤 향이 어우러지는 맛으로, 탄산이 적당해 부드럽게 넘어간다. \n소시지와 잘 어울리며 밀맥주 입문용으로 좋다.");
        insert(R.drawable.beer_stella, "스텔라 아르투아", "Stella Artois", 5.0, 3900, "세계 4대 프리미엄 맥주로 꼽히며, 상큼한 파인애플 향이 특징이다.");
        insert(R.drawable.beer_lowenbrau, "레벤브로이", "Lowenbrau", 5.2, 2500, "목 넘김과 청량감이 좋은 독일 라거맥주. 달달한 풀향과 구수한 보리향이 특징으로, 한국인들에게 익숙한 맛이다.");
    }

}

