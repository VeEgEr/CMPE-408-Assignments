package com.example.vee.assignment05;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * Created by veyisegemenerden 113200010.
 */

public class SecondPart extends AppCompatActivity {

Button btnOne, btnTwo , btnThree;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_part);

        btnOne = (Button) findViewById( R.id.fragmentBtnOne);
        btnTwo = (Button) findViewById( R.id.fragmentBtnTwo);
        btnThree = (Button) findViewById( R.id.fragmentBtnThree);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                view.setBackgroundColor(backGroundColors());
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(backGroundColors());
            }
        });



    }

    public int backGroundColors(){
        Random rnd = new Random();
        int r=rnd.nextInt(256);
        int g =rnd.nextInt(256);
        int b = rnd.nextInt(256);

        int  backGroundColor = Color.rgb(r,g,b);


return backGroundColor;
    }
}
