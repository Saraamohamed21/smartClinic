package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText fullName;
    EditText phone;
    EditText email_reg;
    EditText birth , pass;
    RadioGroup radiosexButton;
    RadioButton radiofButton;
    RadioButton radiomButton;
    Button btnSign;
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = (EditText)findViewById(R.id.ed_name);
        phone = (EditText)findViewById(R.id.ed_phone);
        email_reg = (EditText)findViewById(R.id.edit_email);
        birth = (EditText)findViewById(R.id.edit_password);
        pass = (EditText)findViewById(R.id.edit_Birth);
        radiosexButton = (RadioGroup) findViewById(R.id.radioGrp);
        radiofButton = (RadioButton) findViewById(R.id.radioF);
        radiomButton = (RadioButton) findViewById(R.id.radioM);
        btnSign = (Button) findViewById(R.id.button_sign);
        tv_login = (TextView) findViewById(R.id.tv_log);



        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String full_name = fullName.getText().toString();
                String phone_no = phone.getText().toString();
                String email = email_reg.getText().toString();
                String birth_date = birth.getText().toString();
                String password = pass.getText().toString();
                String type = "reg";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, full_name , phone_no , email , birth_date, password);

//                Intent i = new Intent(RegisterActivity.this, BookActivity.class);
//                startActivity(i);
            }
        });

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(intent);
            }
        });


    }

}
