package com.example.viewpagerandpagefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = findViewById(R.id.pager);
        if (pager != null) {
            pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        }
    }
    public class ViewPagerAdapter extends FragmentPagerAdapter {

        // Left Alt + Insert => generate Constructor

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        // Ctrl + I => Implement method

        @Override
        public Fragment getItem(int i) {
            if(i==0) return PageFragment.newInstance(R.drawable.vd);
                    else if (i==1)return PageFragment.newInstance(R.drawable.apple);
            return PageFragment.newInstance(R.drawable.banana);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}