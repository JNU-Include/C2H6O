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
                .addNormal(Typekit.createFromAsset(this, "fonts/동그라미재단M.ttf"))
                .addBold(Typekit.createFromAsset(this, "fonts/동그라미재단M.ttf"))
                .addCustom1(Typekit.createFromAsset(this, "fonts/JejuHallasan.ttf"))
                .addCustom2(Typekit.createFromAsset(this, "fonts/Spoqa Han Sans Light.ttf"));
    }
}
