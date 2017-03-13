package com.example.vee.assignment07;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Fragment {

   Button btnZero,btnOne,btnTwo,btnThree
    ,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnSum,btnSub,btnDiv,btnMult,btnDot,btnEql,btnClear;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator_layout, viewGroup, false);
        btnZero = (Button) view.findViewById(R.id.btnZero);
        btnOne = (Button) view.findViewById(R.id.btnOne);
        btnTwo = (Button) view.findViewById(R.id.btnTwo);
        btnThree = (Button) view.findViewById(R.id.btnThree);
        btnFour = (Button) view.findViewById(R.id.btnFour);
        btnFive = (Button) view.findViewById(R.id.btnFive);
        btnSix = (Button) view.findViewById(R.id.btnSix);
        btnSeven = (Button) view.findViewById(R.id.btnSeven);
        btnEight = (Button) view.findViewById(R.id.btnEight);
        btnNine = (Button) view.findViewById(R.id.btnNine);
        btnSum = (Button) view.findViewById(R.id.btnAdd);
        btnSub = (Button) view.findViewById(R.id.btnSubtract);
        btnDiv = (Button) view.findViewById(R.id.btnDivide);
        btnMult = (Button) view.findViewById(R.id.btnMultiply);

        btnDot = (Button) view.findViewById(R.id.btnDot);

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() +  String.valueOf(btnDot.getText());
                MainActivity.edt1.setText(text);
            }
        });

        btnEql = (Button) view.findViewById(R.id.btnEqual);
        btnClear = (Button) view.findViewById(R.id.btnClearC);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.edt1.setText("");
            }
        });
        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String main = String.valueOf(MainActivity.edt1.getText()).trim();

try {


    int fN = Integer.parseInt(main.split(" ")[0]);
    int sN = Integer.parseInt(main.split(" ")[2]);


    if (main.split(" ")[1].equals("+")) {
        int sum = fN + sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), sum + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("-")) {
        int sub = fN - sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), sub + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("*")) {
        int mult = fN * sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), mult + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("/")) {
        int div = fN / sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), div + " ", Toast.LENGTH_LONG).show();

    }

}catch (NumberFormatException e){


    double fN = Double.parseDouble(main.split(" ")[0]);
    double sN = Double.parseDouble(main.split(" ")[2]);


    if (main.split(" ")[1].equals("+")) {
        double sum = fN + sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), sum + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("-")) {
        double sub = fN - sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), sub + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("*")) {
        double mult = fN * sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), mult + " ", Toast.LENGTH_LONG).show();

    }
    if (main.split(" ")[1].equals("/")) {
        double div = fN / sN;

        MainActivity.edt1.setText(" ");
        Toast.makeText(getContext(), div + " ", Toast.LENGTH_LONG).show();

    }
}


            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnOne.getText());
                MainActivity.edt1.setText(text);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnTwo.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnThree.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnFour.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnFive.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSix.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSeven.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnEight.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnNine.getText());
                MainActivity.edt1.setText(text);
            }
        });


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnZero.getText());
                MainActivity.edt1.setText(text);
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSum.getText());
                MainActivity.edt1.setText(text);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnSub.getText());
                MainActivity.edt1.setText(text);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnDiv.getText());
                MainActivity.edt1.setText(text);
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = MainActivity.edt1.getText() + String.valueOf(btnMult.getText());
                MainActivity.edt1.setText(text);
            }
        });


        return view;




    }


}
