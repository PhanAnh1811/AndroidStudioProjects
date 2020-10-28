package com.sinhvien.mythirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editA,editB;
    Button btnPlus,btnMinus,btnMulti,btnDivide;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editA=findViewById(R.id.editA);
        editB=findViewById(R.id.editB);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMulti=findViewById(R.id.btnMulti);
        btnDivide=findViewById(R.id.btnDivide);
        textView=findViewById(R.id.txtView);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.valueOf(editA.getText().toString());
                double b=Double.valueOf(editB.getText().toString());
                double c=a+b;
                textView.setText(c+" ");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.valueOf(editA.getText().toString());
                double b=Double.valueOf(editB.getText().toString());
                double c=a-b;
                textView.setText(c+" ");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.valueOf(editA.getText().toString());
                double b=Double.valueOf(editB.getText().toString());
                double c=a*b;
                textView.setText(c+" ");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.valueOf(editA.getText().toString());
                double b=Double.valueOf(editB.getText().toString());
                double c=a/b;
                textView.setText(c+" ");
            }
        });
    }
}