package com.example.chenshuai.android_useloading;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edit;
    private Button btn;
    CountDownTimer timer=new CountDownTimer(60000,1000) {// millisInFuture 总时长， countDownInterval 时间间隔
        @Override
        public void onTick(long millisUntilFinished) {
            btn.setText(millisUntilFinished/1000+"秒");
        }

        @Override
        public void onFinish() {
            btn.setEnabled(true);
            btn.setText("发送验证码");

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit= (EditText) findViewById(R.id.et);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setEnabled(false);
                timer.start();


            }
        });



    }

}
