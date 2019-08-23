package com.example.messagesreply;

import android.Manifest;
import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import static android.content.Intent.ACTION_CALL;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO Start new second activity
//                startActivity(new Intent("com.example.messagesreply"));
                startActivity(new Intent(FullscreenActivity.this,SecondActivity.class));
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/")));

//                startActivity(new Intent(ACTION_CALL, Uri.parse("0969633694")));


//                startActivity(new Intent(Intent.ACTION_DIAL),Uri.parse("0969633694"));


            }
        },3000);





    }


}

