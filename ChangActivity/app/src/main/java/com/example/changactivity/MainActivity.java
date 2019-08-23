package com.example.changactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnActivity1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_obj = new Intent(MainActivity.this, Main2Activity.class);

                intent_obj.putExtra("st1", "SEAM");
                intent_obj.putExtra("st2", "Virak");

                startActivity(intent_obj);
            }
        });

    }
}
