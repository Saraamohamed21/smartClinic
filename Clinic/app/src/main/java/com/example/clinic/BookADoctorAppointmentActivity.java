package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BookADoctorAppointmentActivity extends AppCompatActivity {
    String [] item;
    ArrayList<String> listItem;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_a_doctor_appointment);
        listView = (ListView) findViewById(R.id.listview_item);
        editText = (EditText) findViewById(R.id.editText_search);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BookADoctorAppointmentActivity.this, DoctorActivity.class);
                startActivity(intent);
            }
        });
        initList();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().equals(""))
                {
                    initList();
                }
                else
                {
                    searchItem(s.toString());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void searchItem(String txtSearch)
    {
        for(String i: item)
        {
            if(!i.contains(txtSearch))
            {
                listItem.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }
    public void initList()
    {
        item = new String[] {"Dentisty", "psychiatry", "Ear, Noise and Throat",
                             "Cardiology and Immunology", "Chest and Respiratory",
                             "dermatology", "Pediatrics and New Born", "Neurology",
                              "Gynaecology and Infertility", "Allergy and Immunology",
                              "Dentisty", "psychiatry", "Ear, Noise and Throat",
                               "Cardiology and Immunology", "Chest and Respiratory",
                               "dermatology", "Pediatrics and New Born", "Neurology",
                               "Gynaecology and Infertility", "Allergy and Immunology"};
        listItem = new ArrayList<>(Arrays.asList(item));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, listItem);
        listView.setAdapter(adapter);
    }
}
