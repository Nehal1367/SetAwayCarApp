package com.xyz.www.setawaycars.Corporate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.xyz.www.setawaycars.R;

/**
 * Created by chilu on 23-01-2018.
 */

public class FragmentBookingRoundtrip extends Fragment {


    View view;
    Spinner spinner_day_outstation;
    String days[] = {"1","2"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_outstation_roundtrip, container, false);

        spinner_day_outstation = (Spinner) view.findViewById(R.id.spinner_day_outstation);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line,days);
        spinner_day_outstation.setAdapter(adp);


        return view;
    }
}


