package com.xyz.www.setawaycars.Corporate;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyz.www.setawaycars.R;


/**
 * Created by Rajeshwari on 12-12-2017.
 */

public class FragmentHomeTabs extends Fragment {

    View view;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_booking_tabs,container,false);
        //Toolbar toolbar = (Toolbar) view.findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager = (ViewPager) view.findViewById(R.id.container);
        // PagerAdapter adapter = new FixTabsPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);



        //  ((AppCompatActivity)getActivity()).setSupportActionBar(mtoolbar);



        return view;



    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){


                case 0:
                    FragmentBookingOutstation tab1 = new FragmentBookingOutstation();
                    return tab1;

                case 1:
                    FragmentLocalTab2 tab2 = new FragmentLocalTab2();
                    return tab2;

                case 2:
                    FragmentTransferTab3 tab3 = new FragmentTransferTab3();
                    return tab3;

                default:
                    return null;
            }

        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Outstation";
                case 1:
                    return "Local";
                case 2:
                    return "Transfer";
            }
            return null;
        }


        @Override
        public int getCount() {
            return 3;
        }
    }


}
