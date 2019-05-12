package com.example.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText firstname,lastname,age,username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        age = findViewById(R.id.age);
        username = findViewById(R.id.user_name);
        password = findViewById(R.id.pass);
    }

    public void onReg(View view){

        String str_firstname = firstname.getText().toString();
        String str_lastname = lastname.getText().toString();
        String str_age = age.getText().toString();
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_firstname, str_lastname,str_age,str_username,str_password);
    }
}
