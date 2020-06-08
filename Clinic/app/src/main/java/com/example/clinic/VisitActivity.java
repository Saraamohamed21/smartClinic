package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class VisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        TextView tv = (TextView) findViewById(R.id.textView);
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        EditText ed =( EditText) findViewById(R.id.editText);
        EditText ed1 =( EditText) findViewById(R.id.editText1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(VisitActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Specialties));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }
    public void book_visit(View view)
    {
        Toast.makeText(getApplicationContext(),"You Booked Successfully",Toast.LENGTH_LONG).show();
    }
}
