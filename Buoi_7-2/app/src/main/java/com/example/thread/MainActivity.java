package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num;
    TextView textView;
    EditText editText;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.txt_Count_Time);
        editText =findViewById(R.id.edit_Time);
        btnStart =findViewById(R.id.btn_Start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick1();
            }
        });
    }
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                btnStart.setEnabled(false);
                editText.setEnabled(false);
            } else if (msg.what == 1) {
                int millis = msg.arg1 % 100;
                textView.setText(msg.arg1 / 100 + ":"
                        + ((millis + "").length() != 2 ? "0"
                        + millis : millis));
            } else {
                btnStart.setEnabled(true);
                editText.setEnabled(true);
            } }
    };
    public void onClick1() {
        num = Integer.parseInt
                (editText.getText().toString()) * 100;
        new Thread() {

            public void run() {
                // 0 là trạng bắt đầu
                handler.obtainMessage(0).sendToTarget();
                while (true) {
                    try {
                        if (num == 0) {
                            // 2 là trạng thái kết thúc
                            handler.obtainMessage(2)
                                    .sendToTarget();
                            return; }
                        Thread.sleep(10);
                        num = num - 1;
                        // 1 là trạng thái đang chạy
                        handler.obtainMessage(1,
                                num, 0).sendToTarget();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } } }
        // Dùng start() để chạy ngầm, không làm đơ ứng dụng khi
        // đang xử lý tiến trình bên trong
        }.start();
    }
}