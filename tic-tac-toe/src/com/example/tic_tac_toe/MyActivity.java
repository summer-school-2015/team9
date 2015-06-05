package com.example.tic_tac_toe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener
{ /** Called when the activity is first created. */

int a=0;
    boolean p;
    int h=1;
    String i;
    int fb;
    int[] rc;
    int cop;
    int r;
    private Button ref;
    private Button fbut;
    private Button sbut;
    private Button tbut;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but8;
    private Button but7;
    private Button but9;
    private Button but10;
    private Button but11;
    private Button but12;
    private Button but13;
    private Button but14;
    private Button but15;
    private Button but16;
    private TextView win;



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        p=false;
        rc = new int[16];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fbut =(Button)findViewById(R.id.oneButton);
        fb=R.id.oneButton;
        fbut.setOnClickListener(this);
        ref =(Button)findViewById(R.id.refresh);
        r=R.id.refresh;
        ref.setOnClickListener(this);
        sbut =(Button)findViewById(R.id.twoButton);
        sbut.setOnClickListener(this);
        tbut =(Button)findViewById(R.id.threeButton);
        tbut.setOnClickListener(this);
        but4 =(Button)findViewById(R.id.fourButton);
        but4.setOnClickListener(this);
        but5 =(Button)findViewById(R.id.fiveButton);
        but5.setOnClickListener(this);
        but6=(Button)findViewById(R.id.sixButton);
        but6.setOnClickListener(this);
        but7 =(Button)findViewById(R.id.sevenButton);
        but7.setOnClickListener(this);
        but8 =(Button)findViewById(R.id.eightButton);
        but8.setOnClickListener(this);
        but9=(Button)findViewById(R.id.nineButton);
        but9.setOnClickListener(this);
        but10=(Button)findViewById(R.id.tenButton);
        but10.setOnClickListener(this);
        but11 =(Button)findViewById(R.id.elevenButton);
        but11.setOnClickListener(this);
        but12 =(Button)findViewById(R.id.twelweButton);
        but12.setOnClickListener(this);
        but13 =(Button)findViewById(R.id.thirteenButton);
        but13.setOnClickListener(this);
        but14=(Button)findViewById(R.id.fourteenButton);
        but14.setOnClickListener(this);
        but15 =(Button)findViewById(R.id.fifteenButton);
        but15.setOnClickListener(this);
        but16 =(Button)findViewById(R.id.sixteenButton);
        but16.setOnClickListener(this);
        win=(TextView)findViewById(R.id.message);
    }

    @Override
    public void onClick(View v1) {

        Button button = (Button) v1;

        if (v1.getId() == r) {
            for (int j = fb; j < fb+15; j++) {
                button = (Button)findViewById(j);
                button.setText("");
            }

        }else
        {
            if (h % 2 == 0) {
                rc[v1.getId() - fb] = 1;
                i = "0";
            } else {
                rc[v1.getId() - fb] = 0;
                i = "X";
            }

            for (int s = 0; s < 3; s++) {

            }
            button.setText(String.valueOf(i));
            h++;
        }
    }

}