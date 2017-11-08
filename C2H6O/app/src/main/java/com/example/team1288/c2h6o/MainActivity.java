package com.example.team1288.c2h6o;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationView;

    private final long FINISH_INTERVAL_TIME = 2000;
    private long   backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Home_Fragment()).commit();

        // toolbar 세팅
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);

        //Initialising NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Setting OnNavigationItemSelectedListener to the Navigation View.
        //This is used to perform specific action when an item is clicked.
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Navigation View must close when any of this item is clicked.
                //To do this we use the closeDrawers() method.
                drawerLayout.closeDrawers();

                //Using switch case to identify the ID of the menu item
                // and then performing relevant action.
                switch (menuItem.getItemId()) {
                    case R.id.li_home:
                        //Action Code Here
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Home_Fragment()).commit();
                        return true;
                    case R.id.li_soju:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Soju_mainFragment()).commit();
                        return true;
                    case R.id.li_beer:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Beer_mainFragment()).commit();
                        return true;
                    case R.id.li_makgeolli:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Makgeolli_mainFragment()).commit();
                        return true;
                    case R.id.li_cocktail:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Cocktail_mainFragment()).commit();
                        return true;

                    default:
                        return true;
                }

            }
        });

        //Initialising DrawerLayout.
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        //Initialising ActionBarDrawerToggle and overriding its methods
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer) {
            //We can perform a particular action when the
            // Navigation View is opened by overriding the
            // onDrawerOpened() method.
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            //We can perform a particular action when the
            // Navigation View is closed by overriding the
            // onDrawerClosed() method.
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        //Finally setting up the drawer listener for DrawerLayout
        drawerLayout.setDrawerListener(drawerToggle);

        //Sync State of the navigation icon on the toolbar
        // with the drawer when the drawer is opened or closed.
        drawerToggle.syncState();

    }

    @Override
    public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.l_main_fragment);

        if (fragment instanceof Home_Fragment){
//          두 번 클릭 시 종료
            long tempTime = System.currentTimeMillis();
            long intervalTime = tempTime - backPressedTime;

            if (0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime)
            {
                super.onBackPressed();
            }
            else
            {
                backPressedTime = tempTime;
                Toast.makeText(getApplicationContext(), "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
            }
        } else if (fragment instanceof mainFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Home_Fragment()).commit();
        } else if (fragment instanceof Soju_detailFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Soju_mainFragment()).commit();
        } else if (fragment instanceof Beer_detailFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Beer_mainFragment()).commit();
        } else if (fragment instanceof Makgeolli_detailFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Makgeolli_mainFragment()).commit();
        } else if (fragment instanceof Makgeolli_detailFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Cocktail_mainFragment()).commit();
        }


    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
} // end class
