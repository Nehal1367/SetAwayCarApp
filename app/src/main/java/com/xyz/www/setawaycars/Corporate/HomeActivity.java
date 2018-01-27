package com.xyz.www.setawaycars.Corporate;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.xyz.www.setawaycars.Corporate.Adapters.CustomAdapter_MenuList;
import com.xyz.www.setawaycars.Corporate.Adapters.SubmenuArray;

import com.xyz.www.setawaycars.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //toolbar








        mToolbar=(Toolbar)findViewById(R.id.actionbar);
        setSupportActionBar(mToolbar);

        mdrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        mActionBarDrawerToggle=new ActionBarDrawerToggle(this,mdrawerLayout, R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);



         displayView(0);


         //expandablelistview
        //THE EXPANDABLE
        ExpandableListView elv=(ExpandableListView) findViewById(R.id.corporatemenu);

        final ArrayList<SubmenuArray> team=getData();

        //CREATE AND BIND TO ADAPTER
        CustomAdapter_MenuList adapter=new CustomAdapter_MenuList(this, team);
        elv.setAdapter(adapter);

        //SET ONCLICK LISTENER
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPos,
                                        int childPos, long id) {

                Toast.makeText(getApplicationContext(), team.get(groupPos).players.get(childPos), Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }

    //ADD AND GET DATA

    private ArrayList<SubmenuArray> getData()
    {

        SubmenuArray t1=new SubmenuArray("Home");
        t1.players.add("Wayne Rooney");
        t1.players.add("Van Persie");
        t1.players.add("Ander Herera");
        t1.players.add("Juan Mata");

        SubmenuArray t2=new SubmenuArray("History");
        t2.players.add("Aaron Ramsey");
        t2.players.add("Mesut Ozil");
        t2.players.add("Jack Wilshere");
        t2.players.add("Alexis Sanchez");

        SubmenuArray t3=new SubmenuArray("Bookings");
        t3.players.add("John Terry");
        t3.players.add("Eden Hazard");
        t3.players.add("Diego Costa");
        t3.players.add("Oscar");

        ArrayList<SubmenuArray> allTeams=new ArrayList<SubmenuArray>();
        allTeams.add(t1);
        allTeams.add(t2);
        allTeams.add(t3);

        return allTeams;
    }
        //




    public void displayView(int position) {
        Fragment fragment = null;
        Intent intent = null;
        String title = "Setaway Cars";
        switch (position) {
            case 0:
                fragment = new FragmentHomeTabs();
                break;

            case 1:
                fragment = new FragmentBookingOutstation();
                break;

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            if (position != 0) {
                fragmentTransaction.addToBackStack(null);
            }
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mActionBarDrawerToggle.onOptionsItemSelected(item)){

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
