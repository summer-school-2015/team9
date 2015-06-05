package com.example.myapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener
{ /** Called when the activity is first created. */

int a=0;
    boolean p;
    int cop;
    private Button fbut;
    private Button sbut;
    private Button tbut;
    private TextView textV;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        p=false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fbut =(Button)findViewById(R.id.oneButton);
        fbut.setOnClickListener(this);

        sbut =(Button)findViewById(R.id.twoButton);
        sbut.setOnClickListener(this);

        tbut =(Button)findViewById(R.id.threeButton);
        tbut.setOnClickListener(this);

        textV =(TextView)findViewById(R.id.count);

    }

    @Override
    public void onClick(View v1)
    {

        Button button = (Button)v1;
        int clicks = Integer.parseInt(button.getText().toString());
        clicks++;
        a++;
        for(int i=2; i<a;i++)
        {
            if((a%i==0)&&a>=2)
                p=true;
        }
        if(p==true||a==1)
        {
            fbut.setBackgroundColor(Color.YELLOW);
            sbut.setBackgroundColor(Color.YELLOW);
            tbut.setBackgroundColor(Color.YELLOW);
            p=false;
        }
        else
        {
            fbut.setBackgroundColor(Color.GREEN);
            sbut.setBackgroundColor(Color.GREEN);
            tbut.setBackgroundColor(Color.GREEN);
            int coup = Integer.parseInt(textV.getText().toString());
            coup++;
            textV.setText(String.valueOf(coup));
        }
        button.setText(String.valueOf(clicks));



    }


}
