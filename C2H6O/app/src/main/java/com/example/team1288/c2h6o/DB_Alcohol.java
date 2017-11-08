package com.example.team1288.c2h6o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import java.io.ByteArrayOutputStream;

import static android.content.ContentValues.TAG;

/**
 * Created by ssoso on 2017-08-28.
 */

public class DB_Alcohol {
    // db 관련 상수 선언
    private static String dbName = "alcoholList.db";
    private String tableName;
    private static int dbVersion = 1;

    // db 관련 객체 선언
    private SQLiteDatabase db; // db controller
    private DBHelper_Alcohol helper; // db helper (opener)

    // 부가적인 객체들
    Context context;


    public DB_Alcohol() {

    }

    // 생성자
    public DB_Alcohol(Context context, String tableName)
    {
        this.context = context;
        this.tableName = tableName;
        this.helper = new DBHelper_Alcohol(context, dbName, null, dbVersion);
        db = helper.getWritableDatabase();

        // 테이블 생성
        String sql = "CREATE TABLE " + this.tableName + " ( "
                + "_id integer primary key autoincrement, "
                + "picture BLOB null, "
                + "name varchar(50) null, "
                + "degree double(3,1) null, "
                + "price int null, "
                + "explain text null"
                + " ) ";

        try {
            db.execSQL(sql);
            insertData();
        } catch (SQLException e) {
            db.execSQL("DROP TABLE " + this.tableName + ";");
            db.execSQL(sql);
            insertData();
        }

    }

    // 데이터 입력
    private void insertData()
    {
    }

    // insert
    public void insert(int picture ,String name, double degree, int price, String explain) {
        db = helper.getWritableDatabase(); // db 객체를 얻어온다. 쓰기 가능

        ContentValues values = new ContentValues();
        // db.insert의 매개변수인 values가 ContentValues 변수이므로 그에 맞춤
        // 데이터의 삽입은 put을 이용한다.
        byte[] pic = getByteArrayFromDrawable(getDR(picture));
//        SQLiteStatement p = db.compileStatement("INSERT INTO " + tableName + " values(?);");
//        p.bindBlob(1, pic);
        Log.d(TAG, "알코올 db insert: " + pic);
        values.put("picture", pic);
        values.put("name", name);
        values.put("degree", degree);
        values.put("price", price);
        values.put("explain", explain);
        db.insert(tableName, null, values); // 테이블/널컬럼핵/데이터(널컬럼핵=디폴트)
        // tip : 마우스를 db.insert에 올려보면 매개변수가 어떤 것이 와야 하는지 알 수 있다.
    }

    // update
    public void update (String name, int age) {   }

    // delete
    public void delete (String name) { }

    // select
    public void select() { }

    public byte[] getByteArrayFromDrawable(Drawable d) {
        Bitmap bitmap = ((BitmapDrawable)d).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] data = stream.toByteArray();

        return data;
    }

    public Drawable getDR(int drName){ return  ContextCompat.getDrawable(context, drName);  }

    public SQLiteDatabase getDB() { return db; }
    public void setTableName(String tn) { this.tableName = tn; }
    public String getTableName() { return tableName; }
}
