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
                    case R.id.list_item_1:
                        //Action Code Here
                        Toast.makeText(getApplicationContext(), "You Clicked On List Item 1", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.list_item_2:
                        Toast.makeText(getApplicationContext(), "You Clicked On List Item 2", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(getApplicationContext(), "Drawer Opened", Toast.LENGTH_SHORT).show();
            }

            //We can perform a particular action when the
            // Navigation View is closed by overriding the
            // onDrawerClosed() method.
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Toast.makeText(getApplicationContext(), "Drawer Closed", Toast.LENGTH_SHORT).show();
            }
        };

        //Finally setting up the drawer listener for DrawerLayout
        drawerLayout.setDrawerListener(drawerToggle);

        //Sync State of the navigation icon on the toolbar
        // with the drawer when the drawer is opened or closed.
        drawerToggle.syncState();

        // Button Click Event
        Button.OnClickListener onClickListener = new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()) // 클릭된 버튼의 Id에 따라
                {
                    case R.id.btn_goBeer: // 맥주 페이지로 이동
                        intent = new Intent(getApplicationContext(), // 현재 화면의 제어권자
                                Beer_mainActivity.class); // 다음 넘어갈 클래스 지정
                        startActivity(intent); // 다음 화면으로 넘어간다
                        break;

                    case R.id.btn_goMakgeoll: // 막걸리 페이지로 이동
                        intent = new Intent(getApplicationContext(), Makgeolli_mainActivity.class);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }
            }
        };

        // Button 과 onClickListener 연결
        Button b_goBeer = (Button) findViewById(R.id.btn_goBeer);
        b_goBeer.setOnClickListener(onClickListener);
        Button b_goMakgeolli = (Button) findViewById(R.id.btn_goMakgeoll);
        b_goMakgeolli.setOnClickListener(onClickListener);

    } // end method
} // end class
