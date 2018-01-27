package com.xyz.www.setawaycars.Corporate;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyz.www.setawaycars.Corporate.Adapters.SelectCarCorporateAdapter;
import com.xyz.www.setawaycars.R;

import java.util.ArrayList;

public class FragmentSelectCarCorporate extends Fragment {

    View view;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutmanager;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<String> mDataset;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_select_car_corporate, container, false);



        //RecyclerVIew
        mDataset = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mDataset.add("User Name " + i);
        }

        mRecyclerView = (RecyclerView)view.findViewById(R.id.select_car_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutmanager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutmanager);
        mAdapter = new SelectCarCorporateAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);


        return view;
    }
}
