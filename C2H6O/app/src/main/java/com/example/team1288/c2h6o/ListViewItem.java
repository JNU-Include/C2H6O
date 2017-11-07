package com.example.team1288.c2h6o;

import android.graphics.drawable.Drawable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by ssoso on 2017-07-18.
 */

public class ListViewItem {
    private Drawable icon;
    private Drawable arrow;
    private int idNum;
    private byte[] picture;
    private String name;
    private int degree;
    private int price;
    private String explain;

    // setter
    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setArrow(Drawable arrow) {
        this.arrow = arrow;
    }

    public void setPicture(byte[] picture) { this.picture = picture; }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIdNum(int idNum) { this.idNum = idNum; }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    // getter
    public Drawable getIcon() {

        return icon;
    }

    public Drawable getArrow() {
        return arrow;
    }

    public byte[] getPicture() { return picture; }

    public String getName() {
        return name;
    }

    public int getDegree() {
        return degree;
    }

    public int getPrice() {
        return price;
    }

    public int getIdNum() { return idNum; }

    public String getExplain() {
        return explain;
    }

}
