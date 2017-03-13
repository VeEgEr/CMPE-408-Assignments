package com.example.vee.assignment07;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vee on 11/12/16.
 */

public class Screen extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle save){
        return inflater.inflate(R.layout.screen_layout,container, false);


    }
}
