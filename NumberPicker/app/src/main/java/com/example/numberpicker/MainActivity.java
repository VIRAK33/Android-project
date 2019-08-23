package com.example.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.ProgressBar;

import com.daimajia.numberprogressbar.NumberProgressBar;

import java.awt.font.NumericShaper;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker picker = findViewById(R.id.numberPicker);
        picker.setMinValue(0);
        picker.setMaxValue(200);

        String[] arr = new String[201];
        int i=0;
        for(float f=0; f<=100; f+=0.5){
            arr[i] = String.format(Locale.UK,"%.1f",f);
            i++;
        }
        picker.setDisplayedValues(arr);
        final NumberProgressBar numberProgressBar = findViewById(R.id.number_progress_bar);
        picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
                numberProgressBar.setProgress(newVal);
            }
        });


    }
}
