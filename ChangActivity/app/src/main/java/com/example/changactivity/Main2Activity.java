package com.example.changactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button btn2;
    private TextView firstname;
    private TextView lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 = findViewById(R.id.btnActivity2);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);

        String st1 = getIntent().getExtras().getString("st1");
        String st2 = getIntent().getExtras().getString("st2");

        firstname.setText("");
        lastname.setText("");

        firstname.setText(st1);
        lastname.setText(st2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_obj = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent_obj);
            }
        });

    }
}