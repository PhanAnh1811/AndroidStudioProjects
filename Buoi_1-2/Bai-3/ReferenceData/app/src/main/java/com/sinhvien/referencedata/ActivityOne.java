package com.sinhvien.referencedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity {
    Button btnStart;
    EditText editName,editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
     btnStart=findViewById(R.id.btnStart);
     editAge=findViewById(R.id.editText2);
     editName=findViewById(R.id.editText1);
     btnStart.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(getApplicationContext(),ActivityTwo.class);
             Bundle b=new Bundle();
             b.putString("strName",editName.getText().toString());
             Integer a = Integer.parseInt(editAge.getText().toString());

             b.putInt("IntAge",a);
             i.putExtras(b);
             startActivity(i);
         }
     });
    }
}