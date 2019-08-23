package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CodeOnClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_on_click);

        View b = findViewById(R.id.myButton);


        b.setOnClickListener(view->{ //Lambda expression
            Toast.makeText(this,"This is a toast text",Toast.LENGTH_LONG).show();
        });
//
//        b.setOnClickListener(new View.OnClickListener() { //Anonymous Inner Class
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(CodeOnClick.this,"This is a toast text",Toast.LENGTH_LONG).show();
//            }
//        });



    }


}
