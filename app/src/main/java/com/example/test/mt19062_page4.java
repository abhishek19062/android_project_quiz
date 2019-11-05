package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class mt19062_page4 extends AppCompatActivity {
    int countr=0,countw=0;
    String name,res;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19062_activity_page4);
        Intent bd=getIntent();
        countr=bd.getExtras().getInt("countright");
        countw=bd.getExtras().getInt("countwrong");
        t1=(TextView) findViewById(R.id.igthanks);

        name=bd.getExtras().getString("nm");
        res="Thanks "+name;
        t1.setText(res);
        if((countr+countw)==2)
        {
            TextView mc = findViewById(R.id.score);
            mc.setText(Integer.toString(countr));
        }
        else
            {

                Toast.makeText(getApplicationContext(),"dont act smart!!!",Toast.LENGTH_LONG).show();
        }
    }
}
