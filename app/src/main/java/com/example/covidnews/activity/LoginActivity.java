package com.example.covidnews.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.covidnews.MainActivity;
import com.example.covidnews.R;

public class LoginActivity  extends AppCompatActivity {

    Button btnLogin;
    TextView txtSignup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_login = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent_login);
            }
        });

        txtSignup = (TextView) findViewById(R.id.txt_signup);
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_signup = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent_to_signup);
            }
        });
    }

}
