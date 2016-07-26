package com.example.chidambar.alloperations;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1,t2,t3;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        t3=(TextView)findViewById(R.id.textView3);
        ActionBar actionBar = getSupportActionBar();
        // actionBar.setLogo(R.mipmap.ic_launcher);
        //actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle("Simple Arithmetic Operations");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8b786a")));

    }

    public void clk(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int sum=n1+n2;
        t3.setText(Integer.toString(sum));

    }

    public void clk1(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int sub=n1-n2;
        t3.setText(Integer.toString(sub));

    }
    public void clk2(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int mul=n1*n2;
        t3.setText(Integer.toString(mul));

    }

    public void clk3(View v){
        float n1=Integer.parseInt(e1.getText().toString());
        float n2=Integer.parseInt(e2.getText().toString());
        float div=n1/n2;

        t3.setText(Float.toString(div));

    }



}
