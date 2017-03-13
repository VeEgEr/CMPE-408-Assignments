package com.example.vee.list;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vee on 10/23/16.
 */

public class LastPart extends Activity {
    private String[] datas =new String[32];


    //Icon for scrollView
    Integer[] icons = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4, R.drawable.icon5
            , R.drawable.icon6, R.drawable.icon7, R.drawable.icon8, R.drawable.icon9, R.drawable.icon10, R.drawable.icon11
            , R.drawable.icon12, R.drawable.icon13, R.drawable.icon14, R.drawable.icon15, R.drawable.icon16, R.drawable.icon17
            , R.drawable.icon18, R.drawable.icon19, R.drawable.icon20, R.drawable.icon21, R.drawable.icon22, R.drawable.icon23
            , R.drawable.icon24, R.drawable.icon25, R.drawable.icon26, R.drawable.icon27, R.drawable.icon28, R.drawable.icon29
            , R.drawable.icon30, R.drawable.icon31, R.drawable.icon32};


    //main images
    Integer[] mainImages = {R.drawable.images1, R.drawable.images2, R.drawable.images3, R.drawable.images4, R.drawable.images5
            , R.drawable.images6, R.drawable.images7, R.drawable.images8, R.drawable.images9, R.drawable.images10, R.drawable.images11
            , R.drawable.images12, R.drawable.images13, R.drawable.images14, R.drawable.images15, R.drawable.images16, R.drawable.images17
            , R.drawable.images18, R.drawable.images19, R.drawable.images20, R.drawable.images21, R.drawable.images22, R.drawable.images23
            , R.drawable.images24, R.drawable.images25, R.drawable.images26, R.drawable.images27, R.drawable.images28, R.drawable.images29
            , R.drawable.images30, R.drawable.images31, R.drawable.images32};

    ViewGroup scrollViewgroup;
    ImageView icon;
    ImageView imageSelected;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.last_part);
        //bind GUI controls to Java classes

        LastPart lP = new LastPart();
        lP.insertVariable(datas);
        imageSelected = (ImageView) findViewById(R.id.imageSelected);
        // this layout goes inside the HorizontalScrollView
        scrollViewgroup = (ViewGroup) findViewById(R.id.viewgroup);
        textView = (TextView) findViewById(R.id.which);

        // populate the ScrollView
        for (int i = 0; i < datas.length; i++) {
            //create single frames [icon & caption] using XML inflater
            final View singleFrame = getLayoutInflater().inflate(
                    R.layout.frame_icon, null);

            //frame-0, frame-1, frame-2, ... and so on

            singleFrame.setId(i);
            TextView caption = (TextView) singleFrame.findViewById(R.id.caption);
            ImageView icon = (ImageView) singleFrame.findViewById(R.id.icon);

            //put data [icon, caption] in each frame

            icon.setImageResource(icons[i]);

            caption.setText(datas[i]);

            //add frame to the scrollView

            scrollViewgroup.addView(singleFrame);
            singleFrame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = "shown image is : " + datas[singleFrame.getId()];

                    textView.setText(text);
                    showLargeImage(singleFrame.getId());
                }
            });

        }
    }

    protected void showLargeImage(int frameId) {
        Drawable selectedLargeImage = getResources()
                .getDrawable(mainImages[frameId]);
        imageSelected.setBackground(selectedLargeImage);
    }

    public String[] insertVariable(String [] arr){
        for(int i = 0; i<arr.length; i++){

            arr[i]="data"+i;

        }
        return arr;

    }
}
