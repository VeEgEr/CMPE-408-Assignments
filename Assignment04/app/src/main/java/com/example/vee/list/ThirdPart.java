package com.example.vee.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by vee on 10/23/16.
 */

public class ThirdPart extends Activity {

    private String[] datas =new String[32];

    TextView textView;

    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_part);

        ThirdPart tP = new ThirdPart();
        tP.insertVariable(datas);

        grid = (GridView) findViewById(R.id.gridView1);

        textView = (TextView) findViewById(R.id.ID_3);

        ArrayAdapter<String> adapterOfData= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);

        grid.setAdapter(adapterOfData);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                textView.setText("Your Clicked Item is : " + position);
            }
        });


    }
    public String[] insertVariable(String [] arr){
        for(int i = 0; i<arr.length; i++){

            arr[i]="data"+i;

        }
        return arr;

    }
}


