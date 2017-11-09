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
        insert(R.drawable.cocktail_icingbingsu, "아이싱 빙수", "아이싱 막걸리 2캔, 자몽청, 빙수젤리", 0.0, 0, "아이싱 막걸리 2캔을 얼린다. 그리고 자몽청, 빙수젤리를 넣고 레몬으로 장식했다. 사실! 그냥 아이싱만 얼려 먹어도 된다.");
        insert(R.drawable.cocktail_chocosoju, "초코소주 빙수", "초코우유 450ml, 소주 150ml", 0.0, 0, "초코우유 450ml+소주 150ml\n" +
                "바닐라 아이스크림, 웨하스, 오레오, 견과류, 빼빼로 등을 얹었다. 뭐 예상되는 그런 맛이다.");
        insert(R.drawable.cocktail_bamsam, "밤샘각 전구소주", "전구소다 블러드오렌지맛 1, 소주 1, 핫식스 1, 콜라 0.5", 0.0, 0, "맛 평가\n" +
                "“예거밤 느낌”\n" +
                "“이거 마시고 첫차 탄다”");
        insert(R.drawable.cocktail_bluemo, "블루모히또 전구소주", "전구소다 블루레몬 1 +  밀키스 1+ 탱크보이 0.5+소주1", 0.0, 0, "맛 평가\n" +
                "“소주가 파도처럼 사르르 녹아”\n" +
                "“몰디브 해변에서 팔고 있을 비주얼”");
        insert(R.drawable.cocktail_saga, "사과에 이슬", "참이슬 후레쉬 1, 트로피카나 스파클링 사과맛 1", 0.0, 0, "진짜 이거 진리의 공식입니다ㅠㅠ솔직히 순하리 사과보다 훨씬 맛있음!!! 스파클링은 사과 맛으로 섞는 게 젤 나아여! 웰치스 청포도도 괜찮음! 데미소다 사과도!! ");
        insert(R.drawable.cocktail_fura, "후라보노", "순하리 사과 1, 콜라 1", 0.0, 0, "헐ㅋㅋㅋㅋ진짜 후라보노 맛 남 ㅋㅋㅋㅋ 이 조합 알려주고 떠나신 군인 분께 감사하다고 대신 편지라도 써 주세요 평생 기억할거예요..★");
        insert(R.drawable.cocktail_bluebro, "블루베리 부라더", "좋은데이 블루베리 1, 부라더 소다 1", 0.0, 0, "좋은데이 블루베리는 호불호가 많이 갈리는 편이다. 풍선껌 맛 때문. 그런데 향은 강해서 밀키스 맛이 나는 부라더소다와 잘 어울린다! 단, 식으면 매우 맛이 없으니 주의하자.");
        insert(R.drawable.cocktail_happy, "행복주", "순하리 유자 1, 막걸리 1, 홍초", 0.0, 0, "수십 명에게 검증해본 조합이니 믿고 마시셔도 좋습니다. 예, 제가 추천하는 거예요. 핵심은 소주와 막걸리가 서로의 알콜 영역을 완벽하게 지키는 지점을 찾는 것이예요. 전 늘 1:1로 섞고 그때그때 부족한 쪽을 추가합니다. 색도 딸기우유색이라 행복, 먹고 나서 다음날 숙취도 없어서 행복합니다. 사이다를 홍초만큼 아주 조금 첨가하면 탄산을 더 즐길 수 있습니다.");
        insert(R.drawable.cocktail_ssome, "쏘메리카노", "참이슬 후레쉬 2, 칸타타 3", 0.0, 0, "텀블러에 넣어서 낮술도 가능할 것 같은 조합이다. 안주가 따로 필요 없다. 커피를 얼마나 넣느냐에 따라 알콜 향 세기가 달라지니 취향껏 넣어 조절해보시길.");
    }
}
