package com.example.team1288.c2h6o;

import android.app.Activity;

/**
 * Created by ssoso on 2017-11-10.
 */

public class CollectorDB {
    public static DB_Alcohol sojuDB;
    public static DB_Alcohol beerDB;
    public static DB_Alcohol makgeolliDB;
    public static DB_Alcohol cocktailDB;

    private Activity ac;

    public CollectorDB(Activity ac)
    {
        this.ac = ac;

        sojuDB = new DB_Soju(this.ac);
        beerDB = new DB_Beer(this.ac);
        makgeolliDB = new DB_Makgeolli(this.ac);
        cocktailDB = new DB_Cocktail(this.ac);
    }
}
