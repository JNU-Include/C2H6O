package com.example.team1288.c2h6o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

/**
 * Created by ssoso on 2017-08-31.
 */

public class detailFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_layout, container, false);

        // 정보 받기
        byte[] byte_picture = getArguments().getByteArray("byte_picture");
        String str_name = getArguments().getString("str_name");
        double double_degree = getArguments().getDouble("double_degree");
        int int_price = getArguments().getInt("int_price");
        String str_explain = getArguments().getString("str_explain");

        // 정보 표시
        ImageView iv_PicAlcohol = rootView.findViewById(R.id.iv_PicAlcohol);
        TextView tv_alcoholName = rootView.findViewById(R.id.tv_alcoholName);
        TextView tv_alcoholDegree = rootView.findViewById(R.id.tv_alcoholDegree);
        TextView tv_alcoholPrice = rootView.findViewById(R.id.tv_alcoholPrice);
        TextView tv_alcoholExplain = rootView.findViewById(R.id.tv_alcoholExplain);

        Bitmap bitmap = getAppIcon(byte_picture);

        iv_PicAlcohol.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        tv_alcoholName.setText(str_name);
        tv_alcoholDegree.setText(Double.toString(double_degree) + "%");
        tv_alcoholPrice.setText(Integer.toString(int_price) + "원");
        tv_alcoholExplain.setText(str_explain);

        return rootView;
    }

    public Bitmap getAppIcon(byte[] b) {
        Log.d(TAG, "디테일 프레그먼트 getAppIcon: " + b);
        Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
        return bitmap;
    }
}
