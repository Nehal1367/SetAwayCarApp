package com.xyz.www.setawaycars.Corporate;


import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xyz.www.setawaycars.R;

public class FragmentBookingOutstation extends Fragment {


    View view;
    RadioButton roundtrip,oneway,multicity;
    RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_booking_outstation_tab1,container,false);



        /*radioGroup=(RadioGroup)view.findViewById(R.id.radio_group);
        roundtrip=(RadioButton) view.findViewById(R.id.rb_round_trip);
        oneway=(RadioButton) view.findViewById(R.id.rb_oneway);
        multicity=(RadioButton) view.findViewById(R.id.rb_multicity);*/

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container_booking_body,new FragmentBookingRoundtrip());
        fragmentTransaction.commit();


        return view;
    }
}

