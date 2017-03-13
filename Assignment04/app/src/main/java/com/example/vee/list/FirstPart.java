package com.example.vee.list;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by vee on 10/23/16.
 */

public class FirstPart extends Activity {
    private String[] datas=new String[32];

    TextView textView;
    ListView listV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_part);
        //to insert variable into String[]
        FirstPart fP = new FirstPart();
        fP.insertVariable(datas);
        listV  = (ListView) findViewById(R.id.listView2);
        textView = (TextView) findViewById(R.id.ID_2);

        ArrayAdapter<String> adapterOfData= new ArrayAdapter<>(this, R.layout.first_part, R.id.ID_2, datas);

        listV.setAdapter(adapterOfData);
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {


                textView.setText("Your Clicked data is :"+ position);
                AlertDialog.Builder dialogsetter =
                        new AlertDialog.Builder(FirstPart.this);
                dialogsetter.setCancelable(false);
                dialogsetter.setMessage(datas[position]);
                dialogsetter.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialogsetter.setNegativeButton("Cancel",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialogsetter.create().show();


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


