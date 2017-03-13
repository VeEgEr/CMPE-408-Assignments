package com.example.vee.assignment02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txtOne, txtTwo,money;
    TextView resultTxt,proc,convMoney;
    Button  btnCalculate,btnReset,btnExit;
    RadioGroup rGone,rGtwo;

    //I use these variables for controlling process and translate operate.
    String process = "sum";

    String trans = "tl->usd";
    final Process p = new Process();
    final Translate t = new Translate();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //my editTextes
        txtOne = (EditText) findViewById(R.id.txtOne);
        txtTwo = (EditText) findViewById(R.id.txtTwo);
        money = (EditText) findViewById(R.id.money);
        //my textViews
        resultTxt = (TextView) findViewById(R.id.resultTxt);
        proc = (TextView) findViewById(R.id.proc);
        proc.setText("+");
        convMoney = (TextView) findViewById(R.id.convMoney);
        //my buttons
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnReset = (Button) findViewById(R.id.btnReset);

        //first radiobuttonGroup
        rGone = (RadioGroup) findViewById(R.id.rGone);

        rGone.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               //i used "if" for to set process by radiobuttons and to set textview
                if(checkedId == R.id.sum){
                   process = "sum";
                    proc.setText("+");

                }else  if (checkedId == R.id.subtraction){
                    process = "sub";
                    proc.setText("-");
                }else if (checkedId == R.id.multiplication){
                    process = "mult";
                    proc.setText("*");
                }else if (checkedId == R.id.divide){
                    process = "div";
                    proc.setText("/");
                }
            }
        });

        rGtwo = (RadioGroup) findViewById(R.id.rGtwo);

        rGtwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.tlTOusd){
                    trans = "tl->usd";


                }else  if (checkedId == R.id.tlTOeuro){
                    trans = "tl->euro";

                }else if (checkedId == R.id.usdTOtl){
                    trans = "usd->tl";

                }else if (checkedId == R.id.euroTOtl){
                    trans = "euro->tl";

                }
            }
        });

    }





    public int calculate (View e){

        if (TextUtils.isEmpty(txtOne.getText())){
            Toast.makeText(this,"Please write first number.",Toast.LENGTH_LONG).show();
            return -1;
        }

        if (TextUtils.isEmpty(txtTwo.getText())){
            Toast.makeText(this,"Please write second number.",Toast.LENGTH_LONG).show();
            return -1 ;
        }
        //i created two variables with received variables of edittexts.
        double first =Double.parseDouble(txtOne.getText().toString());
        double second = Double.parseDouble(txtTwo.getText().toString());

        try {

            switch (process){
                case "sum":

                    //to set resultTxt with sum method of Process Class.
                    resultTxt.setText(String.valueOf(p.sum(first,second)));
                    break;
                case "sub":
                    resultTxt.setText(String.valueOf(p.sub(first,second)));
                    break;
                case "mult":
                    resultTxt.setText(String.valueOf(p.mult(first,second)));
                    break;
                case "div":
                    resultTxt.setText(String.valueOf(p.div(first,second)));
                    break;

            }





        }catch(Exception t){

            Toast.makeText(this,"Please choose process",Toast.LENGTH_LONG).show();

            txtOne.setText("");
            txtTwo.setText("");
            }
        money.setText(resultTxt.getText());

        return 1;
    }

    public void exit (View e){

        finish();
    }
    public void reset (View e ){

        txtOne.setText("");
        txtTwo.setText("");
        resultTxt.setText("");
        proc.setText("");
    }


    public void translator(View e){
        //i created a variable with received variables of edittext.

        double first =Double.parseDouble(money.getText().toString());
        try {

           switch (trans){
               case "tl->usd":
                   convMoney.setText((t.tlTOusd(first)+"$"));
                   break;
               case "tl->euro":
                   convMoney.setText((t.tlTOeuro(first)+"£"));
                   break;
               case "usd->tl":
                   convMoney.setText((t.usdTOtl(first)+"tl"));
                   break;
               case "euro->tl":
                   convMoney.setText((t.euroTOtl(first)+"tl"));
                   break;

           }



        }catch(Exception t){

            Toast.makeText(this,"Please choose type",Toast.LENGTH_LONG).show();

            money.setText("");

        }

    }

}
