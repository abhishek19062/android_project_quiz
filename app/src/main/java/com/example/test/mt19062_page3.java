package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class mt19062_page3 extends AppCompatActivity {
int countr=0,countw=0;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19062_activity_page3);
        Intent bd=getIntent();
        countr=bd.getExtras().getInt("countright");
        countw=bd.getExtras().getInt("countwrong");
        name=bd.getExtras().getString("nm");
    }

    public void yes(View view)
    {
        countw++;
        Toast.makeText(getApplicationContext(),"Answer Recorded",Toast.LENGTH_LONG).show();
        Intent bc=new Intent(this, mt19062_page4.class);
        bc.putExtra("countright",countr);
        bc.putExtra("countwrong",countw);
        bc.putExtra("nm",name);
        startActivity(bc);

    }

    public void no(View view)
    {
        countr++;
        Toast.makeText(getApplicationContext(),"Answer Recorded",Toast.LENGTH_LONG).show();
        Intent bc=new Intent(this, mt19062_page4.class);
        bc.putExtra("countright",countr);
        bc.putExtra("countwrong",countw);
        bc.putExtra("nm",name);
        startActivity(bc);

    }
}
