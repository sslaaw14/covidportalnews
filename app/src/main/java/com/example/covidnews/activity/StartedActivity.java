package com.example.covidnews.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.covidnews.R;

public class StartedActivity extends AppCompatActivity {
    Button btnforLogin;
    Button btnforSignup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);

        btnforLogin = (Button) findViewById(R.id.btn_for_login);
        btnforSignup = (Button) findViewById(R.id.btn_for_signup);

        btnforLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_forlogin = new Intent(StartedActivity.this, LoginActivity.class);
                startActivity(intent_forlogin);
            }
        });

        btnforSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_forsignup = new Intent(StartedActivity.this, SignupActivity.class);
                startActivity(intent_forsignup);
            }
        });

    }

}
