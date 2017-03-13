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

import java.util.ArrayList;
import java.util.List;

public class NotePad extends Fragment {
    private List<Button> buttonListLetter;
    Button submit;
    public int[] buttonsLetter = {R.id.btnA, R.id.btnB, R.id.btnC, R.id.btnÇ, R.id.btnD, R.id.btnE, R.id.btnF, R.id.btnG, R.id.btnĞ,
            R.id.btnH, R.id.btnI, R.id.btnİ, R.id.btnJ, R.id.btnK, R.id.btnL, R.id.btnM, R.id.btnN
            , R.id.btnO, R.id.btnÖ, R.id.btnP, R.id.btnR, R.id.btnS, R.id.btnŞ, R.id.btnT, R.id.btnU, R.id.btnÜ, R.id.btnV, R.id.btnY, R.id.btnZ};

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notepad_layout, viewGroup, false);
        buttonListLetter = new ArrayList<Button>();
        submit = (Button) view.findViewById(R.id.btnSubmit);

        // or slightly better
        // buttons = new ArrayList<Button>(BUTTON_IDS.length);
        for (int id : buttonsLetter) {
            Button button = (Button) view.findViewById(id);
            buttonListLetter.add(button);
        }

        for(int i = 0; i<buttonListLetter.size(); i++){
            final int finalI = i;
            buttonListLetter.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String text=MainActivity.edt1.getText()+String.valueOf(buttonListLetter.get(finalI).getText());

                    if(MainActivity.flag==false ) {

                        text=MainActivity.edt1.getText()+String.valueOf(buttonListLetter.get(finalI).getText()).toUpperCase();
                        MainActivity.edt1.setText(text);
                    }
                    else{
                        MainActivity.edt1.setText(text);
                    }
                }
            });
        }
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),MainActivity.edt1.getText(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
