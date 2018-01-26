package com.xyz.www.setawaycars.Corporate;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyz.www.setawaycars.R;

public class FragmentBookingTabs extends Fragment {

    View view;

    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_booking_tabs, container, false);

        return view;
    }
}
