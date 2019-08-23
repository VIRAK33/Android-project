package com.example.usingfragment;

import android.os.Bundle;

import com.example.usingfragment.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;

public class NavActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment f;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        for(Fragment f1:getSupportFragmentManager().getFragments()) transaction.hide(f1);
        transaction.commit();
        if (id == R.id.nav_home) {
            // Handle the camera action
            f = getSupportFragmentManager().findFragmentByTag("FirstFrag");
            if(f == null){
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new FirstFragment(),"FirstFrag")
//                       .replace(R.id.container,new FirstFragment(),"FirstFragment")
//                    .addToBackStack("FirstFragment")
                        .commit();
            }else{
                getSupportFragmentManager()
                        .beginTransaction()
                        .show(f)
                        .commit();
            }

        } else if (id == R.id.nav_gallery) {
            f = getSupportFragmentManager().findFragmentByTag("SecondFrag");
            if(f == null){
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new SecondFragment(),"SecondFrag")
//                       .replace(R.id.container,new FirstFragment(),"FirstFragment")
//                    .addToBackStack("FirstFragment")
                        .commit();
            }else{
                getSupportFragmentManager()
                        .beginTransaction()
                        .show(f)
                        .commit();
            }

        } else if (id == R.id.nav_slideshow) {
            f = getSupportFragmentManager().findFragmentByTag("ThirdFrag");
            if(f == null){
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new ThirdFragment(),"ThirdFrag")
//                       .replace(R.id.container,new FirstFragment(),"FirstFragment")
//                    .addToBackStack("FirstFragment")
                        .commit();
            }else{
                getSupportFragmentManager()
                        .beginTransaction()
                        .show(f)
                        .commit();
            }

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
