package com.xyz.www.setawaycars.Corporate.Adapters;

/**
 * Created by chilu on 24-01-2018.
 */



import java.util.ArrayList;

public class SubmenuArray {

    //PROPERTIES OF A SINGLE TEAM
    public String Name;
    public String Image;
    public ArrayList<String> players=new ArrayList<String>();

    public SubmenuArray(String Name)
    {
        this.Name=Name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Name;
    }
}