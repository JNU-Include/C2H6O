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
                .addNormal(Typekit.createFromAsset(this, "fonts/BMHANNA_11yrs_ttf.ttf"));
    }
}
