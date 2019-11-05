  package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

  public class mt19062_MainActivity extends AppCompatActivity
{
    String name;
    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d("Mycode","in creaate");
       if(savedInstanceState!=null)
       {
           name=savedInstanceState.getString("nm");
       }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19062_activity_main);

    }


    protected void onStart()
    {
        super.onStart();

    EditText e0=findViewById(R.id.mytext);
    e0.setText(name);
    }


    protected void onSaveInstanceState(Bundle outState)
    {

        outState.putString("nm",name);
        super.onSaveInstanceState(outState);

    }


    public void fun(View view)
    {
        EditText e0=findViewById(R.id.mytext);
        name=e0.getText().toString();

        Intent bc=new Intent(this, mt19062_page2.class);
        bc.putExtra("nm",name);
        startActivity(bc);


    }


}
