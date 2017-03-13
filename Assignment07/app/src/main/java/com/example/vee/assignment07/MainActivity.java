package com.example.vee.assignment07;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity {
    private List<Button> buttonListLetter;
    Button up ;
    public int[] buttonsLetter = {R.id.btnA, R.id.btnB, R.id.btnC, R.id.btnÇ, R.id.btnD, R.id.btnE, R.id.btnF, R.id.btnG, R.id.btnĞ,
            R.id.btnH, R.id.btnI, R.id.btnİ, R.id.btnJ, R.id.btnK, R.id.btnL, R.id.btnM, R.id.btnN
            , R.id.btnO, R.id.btnÖ, R.id.btnP, R.id.btnR, R.id.btnS, R.id.btnŞ, R.id.btnT, R.id.btnU, R.id.btnÜ, R.id.btnV, R.id.btnY, R.id.btnZ,
            R.id.btnUnlem, R.id.btnA2, R.id.btnA3, R.id.btnA4, R.id.btnA5
            , R.id.btnA6, R.id.btnA7, R.id.btnA8, R.id.btnA9, R.id.btnA10, R.id.btnA11, R.id.btnA12, R.id.btnA13, R.id.btnA14, R.id.btnA15, R.id.btnA16,
            R.id.btnA17, R.id.btnZeros, R.id.btnOnes, R.id.btnTwos, R.id.btnThrees
            , R.id.btnFours, R.id.btnFives, R.id.btnSixs, R.id.btnSevens, R.id.btnEights, R.id.btnNines};
    static boolean flag = false;
    static TextView edt1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (TextView) findViewById(R.id.textView);


    }


    public void goNotePad(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnNotePad)) {
            fragment = new NotePad();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();

    }

    public void goCalculator(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnCalculator)) {
            fragment = new Calculator();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }


    public void goSpecialKeyBoard(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnSpacial)) {
            fragment = new KeyBoardTwo();

        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }


    public void goLetterKeyBoard(View v) {
        Fragment fragment = null;
        if (v == findViewById(R.id.btnLetter)) {
            fragment = new NotePad();

        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.output, fragment);
        transaction.commit();
    }


    public void lowercase(View v) {
        up = (Button) findViewById(R.id.btnUp);
        if (v == findViewById(R.id.btnUp)) {
            buttonListLetter = new ArrayList<Button>();
            // or slightly better
            // buttons = new ArrayList<Button>(BUTTON_IDS.length);
            for (int id : buttonsLetter) {
                Button button = (Button) findViewById(id);
                buttonListLetter.add(button);
            }

            if (flag == false) {


                for (int i = 0; i < 29; i++) {
                    buttonListLetter.get(i).setAllCaps(flag);
                }
              up.setText("Upper Case");
                flag = true;

            } else if (flag == true) {

                for (int i = 0; i < 29; i++) {
                    buttonListLetter.get(i).setAllCaps(flag);
                }

                flag = false;

                up.setText("Lower Case");

            }
        }
    }


    public void myLetters(View v) {

            buttonListLetter = new ArrayList<Button>();
            // or slightly better
            // buttons = new ArrayList<Button>(BUTTON_IDS.length);
            for (int id : buttonsLetter) {
                Button button = (Button) findViewById(id);
                buttonListLetter.add(button);
            }

            if (v == findViewById(R.id.btnSpaceS)) {
                edt1.setText(edt1.getText() + " ");

            }

            if (v == findViewById(R.id.btnClearer)) {

                edt1.setText(String.valueOf(""));

            }
            if (v == findViewById(R.id.btnSpace)) {
                edt1.setText(edt1.getText() + " ");


            }

            for (int i = 29; i < buttonsLetter.length; i++) {
                if (v == findViewById(buttonsLetter[i])) {

                    String text = edt1.getText() + String.valueOf(buttonListLetter.get(i).getText());
                    edt1.setText(text);
                }
            }





    }
}

