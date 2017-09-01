package com.example.team1288.c2h6o;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.DebugUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by ssoso on 2017-08-04.
 */

public class Home_Fragment extends Fragment implements Button.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);

        ImageButton btn_goSoju = (ImageButton) rootView.findViewById(R.id.ib_soju);
        ImageButton btn_goBeer = (ImageButton) rootView.findViewById(R.id.ib_beer);
        ImageButton btn_goMakgeolli = (ImageButton) rootView.findViewById(R.id.ib_makgeolli);
        ImageButton btn_goCocktail = (ImageButton) rootView.findViewById(R.id.ib_cocktail);

        btn_goSoju.setOnClickListener(this);
        btn_goBeer.setOnClickListener(this);
        btn_goMakgeolli.setOnClickListener(this);
//        btn_goCocktail.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;

        switch (view.getId())
        {
            case R.id.ib_soju:
                fragment = new Soju_mainFragment();
                break;

            case R.id.ib_beer:
                fragment = new Beer_mainFragment();
                break;

            case R.id.ib_makgeolli:
                fragment = new Makgeolli_mainFragment();
                break;

            case R.id.ib_cocktail:
//                fragment = new Cocktail_mainFragment();
                break;

            default:
                break;
        }
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, fragment).commit();
    }
}
