package com.example.team1288.c2h6o;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by ssoso on 2017-11-08.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance()
                .addBold(Typekit.createFromAsset(this, "fonts/JejuHallasan.ttf"))
                .addCustom1(Typekit.createFromAsset(this, "fonts/Spoqa Han Sans Light.ttf"));
    }
}
