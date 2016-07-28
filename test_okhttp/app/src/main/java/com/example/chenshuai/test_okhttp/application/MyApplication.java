package com.example.chenshuai.test_okhttp.application;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by chenshuai on 2016/7/26.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //创建默认的imageloader配置参数
        //ImageLoaderConfiguration configuration=ImageLoaderConfiguration.createDefault(this);
        ImageLoaderConfiguration configuration=new ImageLoaderConfiguration.Builder(this)
                 //打印log信息
                .build();
        ImageLoader.getInstance().init(configuration);
    }
}
