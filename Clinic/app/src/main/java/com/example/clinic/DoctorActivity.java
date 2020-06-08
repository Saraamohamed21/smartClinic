package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DoctorActivity extends AppCompatActivity {
    EditText editText;
    ImageView im , im1 , im2 , im3 , im4;
    TextView tv , tv1 , tv2 , tv3 , tv4,
            tv5 , tv6 , tv7 , tv8 , tv9,
            tv10 , tv11 , tv12 , tv13 , tv14;
    Button btn , btn1 , btn2 , btn3 , btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);


            im = (ImageView) findViewById(R.id.imageView);
            im1 = (ImageView) findViewById(R.id.imageView1);
            im2 = (ImageView) findViewById(R.id.imageView2);
            im3 = (ImageView) findViewById(R.id.imageView3);
            im4 = (ImageView) findViewById(R.id.imageView4);

            tv = (TextView) findViewById(R.id.textView);
            tv1 = (TextView) findViewById(R.id.textView1);
            tv2 = (TextView) findViewById(R.id.textView2);
            tv3 = (TextView) findViewById(R.id.textView3);
            tv4 = (TextView) findViewById(R.id.textView4);

            tv5 = (TextView) findViewById(R.id.textView_location);
            tv6 = (TextView) findViewById(R.id.textView_location1);
            tv7 = (TextView) findViewById(R.id.textView_location2);
            tv8 = (TextView) findViewById(R.id.textView_location3);
            tv9 = (TextView) findViewById(R.id.textView_location4);

            tv10 = (TextView) findViewById(R.id.textView_fess);
            tv11 = (TextView) findViewById(R.id.textView_fess1);
            tv12 = (TextView) findViewById(R.id.textView_fess2);
            tv13 = (TextView) findViewById(R.id.textView_fess3);
            tv14 = (TextView) findViewById(R.id.textView_fess4);

            btn = (Button) findViewById(R.id.button_book);
            btn1 = (Button) findViewById(R.id.button_book1);
            btn2 = (Button) findViewById(R.id.button_book2);
            btn3 = (Button) findViewById(R.id.button_book3);
            btn4 = (Button) findViewById(R.id.button_book4);

        }

    public void book_btn(View view) {
       Toast.makeText(getApplicationContext(),"You Booked Successfully",Toast.LENGTH_LONG).show();
    }
}
