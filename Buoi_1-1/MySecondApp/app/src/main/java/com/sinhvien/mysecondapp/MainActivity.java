package com.sinhvien.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;
    Button mButton1,mButton2,mButton3;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText=(EditText)findViewById(R.id.editName);
        mButton1=(Button)findViewById(R.id.btnHello);
        mButton2=(Button)findViewById(R.id.btnChao);
        mButton3=(Button)findViewById(R.id.btnClear);
        mTextView=(TextView)findViewById(R.id.txtView);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mEditText.getText().toString();
                String text="HELLO "+name;
                mTextView.setText(text);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mEditText.getText().toString();
                String text="CHÀO "+name;
                mTextView.setText(text);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setText("");
                mTextView.setText("");
            }
        });
    }
}