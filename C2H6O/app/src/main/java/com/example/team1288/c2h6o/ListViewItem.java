package com.example.team1288.c2h6o;

import android.graphics.drawable.Drawable;

/**
 * Created by ssoso on 2017-07-18.
 */

public class ListViewItem {
    private Drawable icon;
    private Drawable arrow;
    private String name;
    private String degree;
    private String price;

    // setter
    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setArrow(Drawable arrow) {
        this.arrow = arrow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // getter
    public Drawable getIcon() {

        return icon;
    }

    public Drawable getArrow() {
        return arrow;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getPrice() {
        return price;
    }
}
