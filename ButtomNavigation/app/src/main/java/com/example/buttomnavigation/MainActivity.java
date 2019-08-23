package com.example.buttomnavigation;
 
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                this,
                R.layout.gridview_image_and_string,
                Arrays.asList(new ImageAndString[]{
                        new ImageAndString(R.drawable.coffee,"A"),
                        new ImageAndString(R.drawable.coffee2,"A"),
                        new ImageAndString(R.drawable.coffee3,"A"),
                        new ImageAndString(R.drawable.sad_coffe,"A"),
                        new ImageAndString(R.drawable.bird,"A"),
                })
        );
        GridView gridView = findViewById(R.id.home);
        gridView.setAdapter(adapter);
    }

}
