package com.example.vee.assignment05;



        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TabHost;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Random;


/**
 * Created by veyisegemenerden 113200010.
 */
public class MainActivity extends AppCompatActivity {

    TabHost tabhost;

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabhost=(TabHost)findViewById(android.R.id.tabhost);
        tabhost.setup();

        buttonOne=(Button)findViewById(R.id.buttonOne);
        buttonTwo=(Button)findViewById(R.id.buttonTwo);
        buttonThree=(Button)findViewById(R.id.buttonThree);
        buttonFour=(Button)findViewById(R.id.buttonFour);
        TabHost.TabSpec tabSpec;



        tabSpec= tabhost.newTabSpec("Screen-01");
        tabSpec.setContent(R.id.tabOne);
        tabSpec.setIndicator("Clock",null);
        tabhost.addTab(tabSpec);

        tabSpec= tabhost.newTabSpec("Screen-02");
        tabSpec.setContent(R.id.tabTwo);
        tabSpec.setIndicator("Text",null);
        tabhost.addTab(tabSpec);

        tabSpec= tabhost.newTabSpec("Screen-03");
        tabSpec.setContent(R.id.tabImage);
        tabSpec.setIndicator("Image",null);
        tabhost.addTab(tabSpec);

        tabSpec= tabhost.newTabSpec("Screen-04");
        tabSpec.setContent(R.id.tabColor);
        tabSpec.setIndicator("Color",null);
        tabhost.addTab(tabSpec);


        for (int i = 0; i < tabhost.getTabWidget().getChildCount(); i++) {

             tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs

            tv.setTextColor(Color.parseColor("#ffffff"));

        }
        tabhost.getTabWidget().getChildAt(0).isHovered();

        tv = (TextView) tabhost.getTabWidget().getChildAt(0).findViewById(android.R.id.title);
        tv.setTextColor(Color.parseColor("#4c0000"));
        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                for (int i = 0; i < tabhost.getTabWidget().getChildCount(); i++) {

                     tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
                    tv.setTextColor(Color.parseColor("#ffffff"));

                }


                tv = (TextView) tabhost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
                tv.setTextColor(Color.parseColor("#4c0000"));

                String text="My Tab id is" +tabId;
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
            }
        });


    }

    public void changeBackGround(View e){
        if(e == buttonOne) {
            tabhost.findViewById(R.id.tabOne).setBackgroundColor(backGroundColor());
        }else if(e == buttonTwo) {
            tabhost.findViewById(R.id.tabTwo).setBackgroundColor(backGroundColor());
        }else  if(e == buttonThree) {
            tabhost.findViewById(R.id.tabImage).setBackgroundColor(backGroundColor());
        }else
        tabhost.findViewById(R.id.tabColor).setBackgroundColor(backGroundColor());
    }

    public int backGroundColor(){
        Random rnd = new Random();
        int r=rnd.nextInt(256);
        int g =rnd.nextInt(256);
        int b = rnd.nextInt(256);

      int  backGroundColor = Color.rgb(r,g,b);
        return  backGroundColor;
    }
}