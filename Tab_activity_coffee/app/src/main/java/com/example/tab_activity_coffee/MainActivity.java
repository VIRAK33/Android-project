package com.example.tab_activity_coffee;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
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
                    mTextMessage.setText("Hot Drink");
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText("Cold Drink");
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText("Fast Food");
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
                        new ImageAndString(R.drawable.coffee,"Costa"),
                        new ImageAndString(R.drawable.coffee2,"Hot cafe"),
                        new ImageAndString(R.drawable.coffee3,"Late"),
                        new ImageAndString(R.drawable.sad_coffe,"Sad time"),
                        new ImageAndString(R.drawable.bird,"Bird"),
                        new ImageAndString(R.drawable.coffee,"Costa")
                })
        );
        GridView gridView = findViewById(R.id.home);
        gridView.setAdapter(adapter);
    }

}
