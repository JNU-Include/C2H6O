package com.example.team1288.c2h6o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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

public class Cocktail_detailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cocktail_detail, container, false);

        // 정보 받기
        byte[] byte_picture = getArguments().getByteArray("byte_picture");
        String str_name = getArguments().getString("str_name_kr");
        String str_material = getArguments().getString("str_name_en");
        String str_explain = getArguments().getString("str_explain");

        Log.d(TAG, "onCreateView: str_name 캌테일?"+ str_name);

        // 정보 표시
        ImageView iv_PicCock = rootView.findViewById(R.id.iv_PicCock);
        TextView tv_cockName = rootView.findViewById(R.id.tv_cockName);
        TextView tv_cockMaterial = rootView.findViewById(R.id.tv_cockMaterial);
        TextView tv_cockExplain = rootView.findViewById(R.id.tv_cockExplain);

        Bitmap bitmap = getAppIcon(byte_picture);

        iv_PicCock.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        tv_cockName.setText(str_name);
        tv_cockMaterial.setText(str_material);
        tv_cockExplain.setText(str_explain);

        return rootView;
    }

    public Bitmap getAppIcon(byte[] b) {
        Log.d(TAG, "디테일 프레그먼트 getAppIcon: " + b);
        Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
        return bitmap;
    }
}
