package com.example.chidambar.alloperations;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Runnable{



    private Thread mobjThread;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobjThread=new Thread(this);
        mobjThread.start();
        t1=(TextView)findViewById(R.id.text);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/AgentOrange.ttf");
        t1.setTypeface(face);
    }
    @Override
    public void run()
    {
        try {
            Thread.sleep(5000);

            startActivity(new Intent(this, Main2Activity.class));
            this.finish();


        }
        catch(InterruptedException e)
        {

        }

    }

}
