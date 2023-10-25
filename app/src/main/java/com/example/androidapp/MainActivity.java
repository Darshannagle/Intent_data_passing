package com.example.androidapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    String[] dept_array = {"CE", "IT", "EC"};
    String SID, Name, Dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1 = (EditText) findViewById(R.id.editTextText);
        EditText e2 = (EditText) findViewById(R.id.editTextText2);
        Spinner s = (Spinner) findViewById(R.id.spinner);
       Button bt = (Button) findViewById(R.id.button1);
        ArrayAdapter aa = new ArrayAdapter(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, dept_array);
        aa.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        s.setAdapter(aa);
        bt.setOnClickListener(v -> {
            SID = e1.getText().toString();
            Name = e2.getText().toString();
            Dept = s.getSelectedItem().toString();
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("name_key", Name);
            i.putExtra("SID_Key", SID);
            i.putExtra("dept_key", Dept);
            startActivity(i);
        });
    }
}
