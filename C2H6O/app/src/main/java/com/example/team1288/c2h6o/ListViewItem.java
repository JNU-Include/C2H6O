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
    private String name_kr;
    private String name_en;
    private double degree;
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

    public void setNameKR(String name_kr) {
        this.name_kr = name_kr;
    }

    public void setNameEN(String name_en) {
        this.name_en = name_en;
    }

    public void setDegree(double degree) {
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

    public String getNameKR() {
        return name_kr;
    }

    public String getNameEN() {
        return name_en;
    }

    public double getDegree() {
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
