package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    ViewPager vp;
    LinearLayout llh;
    slideAdapter slideAdapter;
    TextView[] N_dot;
    Button btn_start;

    int nCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        vp = (ViewPager) findViewById(R.id.slideviewpager);
        llh = (LinearLayout) findViewById(R.id.dotsLayout);
        btn_start = (Button) findViewById(R.id.button_start);
        slideAdapter = new slideAdapter(this);
        vp.setAdapter(slideAdapter);
        addDots();


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
    public void addDots()
    {
        N_dot = new TextView[3];
        for (int i =0; i<N_dot.length;i++)
        {
            N_dot[i] = new TextView(this);
            N_dot[i].setText(Html.fromHtml("&#8226;"));
            N_dot[i].setTextSize(35);
            N_dot[i].setTextColor(getResources().getColor(R.color.colowh));

            llh.addView(N_dot[i]);

        }
    }

}
