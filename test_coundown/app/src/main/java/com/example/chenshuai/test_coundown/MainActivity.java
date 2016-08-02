package com.example.chenshuai.test_coundown;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView textView;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                CountDownTimerUtils countDownTimerUtils=new CountDownTimerUtils(this,6000,1000,btn);
                countDownTimerUtils.start();

                break;
        }
    }



}

