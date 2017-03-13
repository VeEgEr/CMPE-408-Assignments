package com.example.vee.assignment05;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by veyisegemenerden 113200010
 */
public class FragmentOne extends Fragment {

    //inflate view inside fragment1
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle save){
        return inflater.inflate(R.layout.fragment_one,container, false);


    }


}
