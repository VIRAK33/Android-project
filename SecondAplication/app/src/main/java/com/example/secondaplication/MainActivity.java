package com.example.secondaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.login_activity);
        setContentView(R.layout.sign_up_activity);
        setContentView(R.layout.scroll_view);
    }
}
