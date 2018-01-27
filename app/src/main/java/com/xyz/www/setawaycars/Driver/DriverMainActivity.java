package com.xyz.www.setawaycars.Driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.xyz.www.setawaycars.R;

public class DriverMainActivity extends AppCompatActivity {


    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private Toolbar mToolbar;
    ImageView myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_driver);

    //toolbar



        mToolbar=(Toolbar)findViewById(R.id.actionbar);
        setSupportActionBar(mToolbar);

        mdrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        mActionBarDrawerToggle=new ActionBarDrawerToggle(this,mdrawerLayout, R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       // myprofile=(ImageView)findViewById(R.id.myprofile);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

            if (mActionBarDrawerToggle.onOptionsItemSelected(item)){

                    return true;
            }

        return super.onOptionsItemSelected(item);
    }
}
