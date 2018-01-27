package com.xyz.www.setawaycars.Corporate.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.xyz.www.setawaycars.R;

import java.util.ArrayList;

/**
 * Created by chilu on 02-11-2017.
 */

public class SelectCarCorporateAdapter extends RecyclerView.Adapter<SelectCarCorporateAdapter.ViewHolder>{




    private ArrayList<String> mDataset;

    public SelectCarCorporateAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public SelectCarCorporateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.select_car_corporate_layout, parent ,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(SelectCarCorporateAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;


        public ViewHolder(View itemView) {
            super(itemView);
            mTitle=(TextView) itemView.findViewById(R.id.txt_fare);
        }
    }
}