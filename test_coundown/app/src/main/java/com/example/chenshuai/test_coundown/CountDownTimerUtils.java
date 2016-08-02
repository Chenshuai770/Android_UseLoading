package com.example.chenshuai.test_coundown;

import android.app.Activity;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;

/**
 * Created by chenshuai on 2016/8/2.
 */
public class CountDownTimerUtils extends CountDownTimer{
    private Activity mActivity;
    private Button btn;


    /**
     * @param
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
*                          {@link #onTick(long)} callbacks.
     */
    public CountDownTimerUtils(Activity mActivity, long millisInFuture, long countDownInterval,Button btn) {
        super(millisInFuture, countDownInterval);
        this.mActivity=mActivity;
        this.btn=btn;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        btn.setClickable(false);
        btn.setText(millisUntilFinished/1000+"秒");//设计倒计时时间
        btn.setBackgroundResource(R.drawable.bg_identify_code_normal);

        btn.setTextColor(Color.BLACK);
        //获取按钮上的文字
        SpannableString spannableString=new SpannableString(btn.getText());
        ForegroundColorSpan span=new ForegroundColorSpan(Color.RED);
        /**
         * public void setSpan(Object what, int start, int end, int flags) {
         * 主要是start跟end，start是起始位置,无论中英文，都算一个。
         * 从0开始计算起。end是结束位置，所以处理的文字，包含开始位置，但不包含结束位置。
         */
        //将倒计时设置为红色
        spannableString.setSpan(span,0,2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        btn.setText(spannableString);
    }

    @Override
    public void onFinish() {
        btn.setText("验证码 ");
        btn.setClickable(true);
        btn.setBackgroundResource(R.drawable.bg_identify_code_normal);

    }
}
