package com.example.vee.assignment07;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class KeyBoardTwo extends Fragment {


    Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_keyboard, viewGroup, false);
        submit = (Button) view.findViewById(R.id.btnSubmitS);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getContext(),MainActivity.edt1.getText(),Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }








}

