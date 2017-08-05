package com.example.team1288.c2h6o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by ssoso on 2017-08-04.
 */

// Beer database 생성 및 초기화
public class DB_Beer {
    // db 관련 상수 선언
    private static final String dbName = "alcoholList.db";
    private static final String tableName = "beerList";
    private static final int dbVersion = 1;

    // db 관련 객체 선언
    private SQLiteDatabase db; // db controller
    private DBHelper_Alcohol helper; // db helper (opener)

    // 부가적인 객체들
    Context context;

    // 생성자
    public DB_Beer(Context context)
    {
        this.context = context;
        this.helper = new DBHelper_Alcohol(context, dbName, null, dbVersion);
        db = helper.getWritableDatabase();

        // 테이블 생성
        String sql = "CREATE TABLE " + tableName + " ( "
                + "_id integer primary key autoincrement, "
                + "name varchar(50) null, "
                + "degree int null, "
                + "price int null, "
                + "explain text null"
                + " ) ";

        try {
            db.execSQL(sql);
            insertData();
        } catch (SQLException e) { }

    }

    // 데이터 입력
    private void insertData()
    {
        insert("카스", 15, 1500, "이것은 카스이다...");
        insert("하이트", 16, 1600, "나는 하이트가 실다....");
        insert("맥스", 17, 1700, "맥스 왜먹냐 ㄹㅇ");
        insert("하이네켄", 18, 1800, "하이네켄...병이..예쁘다...");
        insert("삿포로", 19, 1900, "삿포로 별 존예임 ㄹㅇ");
        insert("호가든", 20, 2000, "로제 마셔보고 싶다");
        insert("호가든 로제", 21, 2100, "마셔보고 싶어서 넣어봤다");
        insert("아사히", 22, 2200, "먹을만한데 좀 씀");
        insert("아사히 드라이", 23, 2300, "아사히랑 다른건가?");
        insert("산미구엘", 24, 2400, "비싸다 안먹어봤다");
        insert("칭따오", 25, 2500, "양꼬치엔 칭따오!");
        insert("코젤다크", 26, 2600, "흑맥주래;");
        insert("바이드만 슈바르츠", 27, 2700, "흑맥주 밀맥주 구분란 넣을까...");
        insert("코르넨브루", 28, 2800, "이름 존나김");
        insert("필스너 우르켈", 29, 2900, "그만 치고 싶다");
        insert("베를리너 킨들 필스너", 30, 3000, "ㅇㅅㅇ");
        insert("파울라너 헤페바이스비어", 31, 3100, "와씨발 왜 안마셔본 애들만 나옴");
        insert("스텔라 아르투아", 32, 3200, "스뗄라");
        insert("레벤브로이", 33, 3300, "그만하자...");
    }

    // insert
    public void insert(String name, int degree, int price, String explain) {
        db = helper.getWritableDatabase(); // db 객체를 얻어온다. 쓰기 가능

        ContentValues values = new ContentValues();
        // db.insert의 매개변수인 values가 ContentValues 변수이므로 그에 맞춤
        // 데이터의 삽입은 put을 이용한다.
        values.put("name", name);
        values.put("degree", degree);
        values.put("price", price);
        values.put("explain", explain);
        db.insert(tableName, null, values); // 테이블/널컬럼핵/데이터(널컬럼핵=디폴트)
        // tip : 마우스를 db.insert에 올려보면 매개변수가 어떤 것이 와야 하는지 알 수 있다.
    }

    // update
    public void update (String name, int age) {
        db = helper.getWritableDatabase(); //db 객체를 얻어온다. 쓰기가능

        ContentValues values = new ContentValues();
        values.put("age", age);    //age 값을 수정
        db.update("student", values, "name=?", new String[]{name});
        /*
         * new String[] {name} 이런 간략화 형태가 자바에서 가능하다
         * 당연하지만, 별도로 String[] asdf = {name} 후 사용하는 것도 동일한 결과가 나온다.
         */

        /*
         * public int update (String table,
         * ContentValues values, String whereClause, String[] whereArgs)
         */
    }

    // delete
    public void delete (String name) {
        db = helper.getWritableDatabase();
        db.delete("student", "name=?", new String[]{name});
        Log.i("db", name + "정상적으로 삭제 되었습니다.");
    }

    // select
    public void select() {

        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용

        db = helper.getReadableDatabase(); // db객체를 얻어온다. 읽기 전용
        Cursor c = db.query("student", null, null, null, null, null, null);

        /*
         * 위 결과는 select * from student 가 된다. Cursor는 DB결과를 저장한다. public Cursor
         * query (String table, String[] columns, String selection, String[]
         * selectionArgs, String groupBy, String having, String orderBy)
         */

        while (c.moveToNext()) {
            // c의 int가져와라 ( c의 컬럼 중 id) 인 것의 형태이다.
            int _id = c.getInt(c.getColumnIndex("_id"));
            String name = c.getString(c.getColumnIndex("name"));
            int age = c.getInt(c.getColumnIndex("age"));
            String address = c.getString(c.getColumnIndex("address"));
            Log.i("db", "id: " + _id + ", name : " + name + ", age : " + age
                    + ", address : " + address);
        }
    }

    public SQLiteDatabase getDB() { return db; }
    public String getTableName() { return tableName; }
}

