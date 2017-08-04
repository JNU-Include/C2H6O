package com.example.team1288.c2h6o;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Home_Fragment()).commit();

        setToolbar();
        setDrawer();

    }

    private void setToolbar()
    {
        // toolbar 세팅
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
    }

    private void setDrawer()
    {
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
                        return true;
                    case R.id.li_beer:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Beer_mainFragment()).commit();
                        return true;
                    case R.id.li_makgeolli:
                        getSupportFragmentManager().beginTransaction().replace(R.id.l_main_fragment, new Makgeolli_mainFragment()).commit();
                        return true;
                    case R.id.li_cocktail:
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

} // end class
