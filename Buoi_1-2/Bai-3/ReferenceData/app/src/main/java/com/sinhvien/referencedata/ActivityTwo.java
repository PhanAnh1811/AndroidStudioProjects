package com.sinhvien.referencedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView tvRes=findViewById(R.id.textView);
        Bundle b=getIntent().getExtras();
        String name=b.getString("strName");
        int age=b.getInt("IntAge");
        tvRes.setText("Full name: "+name+"\n"+"Age: "+age);
    }
}