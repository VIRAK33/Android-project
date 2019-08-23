package com.example.messagesreply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_second,menu);
        return true;

    }

    public void showSetting(MenuItem item){
        //TODO show setting activity
//        startActivities(new Intent());
        startActivity(new Intent(SecondActivity.this,WebViewActivity.class));
    }
}
