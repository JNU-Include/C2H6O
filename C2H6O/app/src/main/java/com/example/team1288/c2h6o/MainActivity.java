package com.example.team1288.c2h6o;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Click Event
        Button.OnClickListener onClickListener = new Button.OnClickListener()
        {

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
    }
}
