package com.example.tablerelative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Viewpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpage);
        ViewPager pager = findViewById(R.id.pager);
        if (pager != null) {
            pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        }
        TabLayout tabLayout = findViewById(R.id.tabLaout);
        if(tabLayout != null){
            tabLayout.setupWithViewPager(pager);
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
                return PageFragment.newInstance(R.drawable.apple);
            }

            @Override
            public int getCount() {
                return 2;
            }


            @Override
            public CharSequence getPageTitle(int position) {
                if(position==0) return "Developer";
                return "Apple";
            }
        }
}
