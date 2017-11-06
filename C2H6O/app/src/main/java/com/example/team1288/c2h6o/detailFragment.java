package com.example.team1288.c2h6o;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ssoso on 2017-08-31.
 */

public class detailFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_layout, container, false);

        // 정보 받기
        String str_name = getArguments().getString("str_name");
        int int_degree = getArguments().getInt("int_degree");
        int int_price = getArguments().getInt("int_price");
        String str_explain = getArguments().getString("str_explain");

        // 정보 표시
        ImageView iv_PicAlcohol = rootView.findViewById(R.id.iv_PicAlcohol);
        TextView tv_alcoholName = rootView.findViewById(R.id.tv_alcoholName);
        TextView tv_alcoholDegree = rootView.findViewById(R.id.tv_alcoholDegree);
        TextView tv_alcoholPrice = rootView.findViewById(R.id.tv_alcoholPrice);
        TextView tv_alcoholExplain = rootView.findViewById(R.id.tv_alcoholExplain);

        tv_alcoholName.setText(str_name);
        tv_alcoholDegree.setText(Integer.toString(int_degree) + "%");
        tv_alcoholPrice.setText(Integer.toString(int_price) + "원");
        tv_alcoholExplain.setText(str_explain);

        return rootView;
    }
}
