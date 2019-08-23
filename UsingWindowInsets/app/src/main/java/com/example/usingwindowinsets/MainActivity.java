package com.example.usingwindowinsets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.argb(80,0,0,0)));
        }

        View view = findViewById(R.id.imageView);
        if(view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() {
                @Override
                public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                    ViewGroup.MarginLayoutParams params =
                            (ViewGroup.MarginLayoutParams) v.getLayoutParams();
                    params.topMargin = 0;
                    params.bottomMargin = 0;
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
    }
}
