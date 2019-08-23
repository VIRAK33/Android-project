package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.button);
    }


    public void btnClick(View view) {
        ((Button)view).setText("Thanks!");
    }

    public void showToat(View view) {
        Toast.makeText(this,"It is toas message!",Toast.LENGTH_LONG).show();
    }
}
