package com.example.androidapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity { String SID,Name,Dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t1 = (TextView) findViewById(R.id.textView10);
        TextView t2 = (TextView) findViewById(R.id.textView11);
        TextView t3 = (TextView) findViewById(R.id.textView12);
        Intent i = getIntent();
        SID = i.getStringExtra("SID_Key");
        Name = i.getStringExtra("name_key");
        Dept = i.getStringExtra("dept_key");
        t1.setText(SID);
        t2.setText(Name);
        t3.setText(Dept);
    }  }
