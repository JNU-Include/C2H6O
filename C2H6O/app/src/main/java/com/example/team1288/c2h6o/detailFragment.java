package com.example.team1288.c2h6o;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ssoso on 2017-08-31.
 */

public class detailFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail, container, false);

        // 정보 받기
        String str_name = getArguments().getString("str_name");
        int int_degree = getArguments().getInt("int_degree");
        int int_price = getArguments().getInt("int_price");
        String str_explain = getArguments().getString("str_explain");

        // 정보 표시
        TextView tv_beerName = rootView.findViewById(R.id.tv_beerName);
        TextView tv_beerDegree = rootView.findViewById(R.id.tv_beerDegree);
        TextView tv_beerPrice = rootView.findViewById(R.id.tv_beerPrice);
        TextView tv_beerExplain = rootView.findViewById(R.id.tv_beerExplain);

        tv_beerName.setText(str_name);
        tv_beerDegree.setText(Integer.toString(int_degree) + "%");
        tv_beerPrice.setText(Integer.toString(int_price) + "원");
        tv_beerExplain.setText(str_explain);

        return rootView;
    }
}
