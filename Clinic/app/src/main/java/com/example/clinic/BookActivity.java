package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    TextView tv  ;
    Button bt_doc ;
    Button bt_visit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
         tv = (TextView) findViewById(R.id.textView_book);
         bt_doc =(Button) findViewById(R.id.button_spe);
         bt_visit =(Button) findViewById(R.id.button_homev);

        bt_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BookActivity.this , BookADoctorAppointmentActivity.class);
                startActivity(i);
            }
        });

        bt_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(BookActivity.this , VisitActivity.class);
                startActivity(in);

            }
        });
    }
}
