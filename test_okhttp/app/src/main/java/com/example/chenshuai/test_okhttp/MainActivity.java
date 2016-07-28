package com.example.chenshuai.test_okhttp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.chenshuai.test_okhttp.entity.TestMessage;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button get;
    private Button btn1;
    private Button btn2;
    private String josnStr="{\"respCode\":\"00\",\"respMsg\":\"OK\",\"body\":{\"totalCount\":0,\"designers\":[{\"uid\":1027,\"realname\":\"鬼斧先生\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160323/1027_14d4ce31-5633-49af-b48d-6582ba7b86f0.png\",\"totalScore\":5.00,\"feeLow\":150,\"feeHigh\":200,\"caseCount\":24},{\"uid\":1557,\"realname\":\"黄振标\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160115/M_a6c2f422-34b5-4266-8591-580b83576a7f.jpg\",\"totalScore\":5.00,\"feeLow\":50,\"feeHigh\":70,\"caseCount\":17},{\"uid\":1026,\"realname\":\"申薇\",\"sAvatar\":\"http://112.124.35.101:8888/upimg/150507/1026_18259793-e730-416f-a7a8-3cf4b1d11436.jpg\",\"totalScore\":4.70,\"feeLow\":100,\"feeHigh\":200,\"caseCount\":13},{\"uid\":1077,\"realname\":\"曹迥&中坚KTV设计\",\"sAvatar\":\"\",\"totalScore\":4.00,\"feeLow\":100,\"feeHigh\":200,\"caseCount\":12},{\"uid\":1678,\"realname\":\"何巍\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160420/1678_4c9e38cd-70c2-44a9-81a6-92661a812868.png\",\"totalScore\":4.00,\"feeLow\":150,\"feeHigh\":300,\"caseCount\":12},{\"uid\":1465,\"realname\":\"周 娜\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160521/1465_d1a8fee1-94b3-472c-94a4-0ad08fb3e763.png\",\"totalScore\":5.00,\"feeLow\":50,\"feeHigh\":70,\"caseCount\":11},{\"uid\":1728,\"realname\":\"吴Design\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160517/1728_10baf8b5-b250-49ff-8870-03cbd417e870.png\",\"totalScore\":5.00,\"feeLow\":80,\"feeHigh\":200,\"caseCount\":11},{\"uid\":1603,\"realname\":\"杨朝钧\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160521/1603_b73e11a9-bd97-49b2-a3b6-a2a4658de9ce.jpg\",\"totalScore\":4.70,\"feeLow\":50,\"feeHigh\":70,\"caseCount\":9},{\"uid\":1471,\"realname\":\"熊杰\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160219/1471_8b6f2313-9090-42b7-b944-05f4cb20249c.png\",\"totalScore\":5.00,\"feeLow\":50,\"feeHigh\":70,\"caseCount\":8},{\"uid\":1612,\"realname\":\"庄德\",\"sAvatar\":\"http://huihome.cn:8888/upimg/160304/1612_a27bc610-65a6-407b-850d-b57585c116c8.jpg\",\"totalScore\":4.00,\"feeLow\":80,\"feeHigh\":100,\"caseCount\":8}]}}";

    private ImageLoader imageLoader;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private Button btn3;
    private ListView listView;
    private JSONObject jsonObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

    }

    private void init() {
        get= (Button) findViewById(R.id.get);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        get.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        image1= (ImageView) findViewById(R.id.image1);
        image2= (ImageView) findViewById(R.id.image2);
        image3= (ImageView) findViewById(R.id.image3);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.get:
                String url="http://112.124.35.101:8080/huihome/api/designer?&pageSize=10&by=CASE&pageIndex=1";
                OkHttpUtils.get().url(url).build().execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        String date=response;


                    }
                });

                break;
            case R.id.btn1://使用loadimage的方法加载图片
                Gson gson = new Gson();
                TestMessage t=gson.fromJson(josnStr,TestMessage.class);
                ImageSize mimageSize=new ImageSize(100,100);
                String str=t.getBody().getDesigners().get(0).getSAvatar();//url
                /*ImageLoader.getInstance().loadImage(str, new ImageLoadingListener() {
                    @Override
                    public void onLoadingStarted(String s, View view) {

                    }

                    @Override
                    public void onLoadingFailed(String s, View view, FailReason failReason) {

                    }

                    @Override
                    public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                        image.setImageBitmap(bitmap);

                    }

                    @Override
                    public void onLoadingCancelled(String s, View view) {

                    }
                });

*/
                DisplayImageOptions options = new DisplayImageOptions.Builder()
                        .cacheInMemory(true)
                        .cacheOnDisk(true)
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .build();
                ImageLoader.getInstance().loadImage(str,mimageSize,options,new SimpleImageLoadingListener(){
                    @Override
                    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                        super.onLoadingComplete(imageUri, view, loadedImage);
                        image1.setImageBitmap(loadedImage);
                    }
                });//两种方法都可以解析图片

                break;
            case R.id.btn2:
                Gson gson1 = new Gson();
                TestMessage t1=gson1.fromJson(josnStr,TestMessage.class);
                //ImageSize mimageSize1=new ImageSize(100,100);
                String str1=t1.getBody().getDesigners().get(1).getSAvatar();//url
                DisplayImageOptions options3 = new DisplayImageOptions.Builder()
                        .cacheInMemory(true)
                        .cacheOnDisk(true)
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .build();

                ImageLoader.getInstance().displayImage(str1,image2,options3);

                break;

            case R.id.btn3:
                try {
                    jsonObject=new JSONObject(josnStr);
                    JSONArray aNews=new JSONArray(jsonObject.getString("designers"));
                    List listDate=new ArrayList();
                } catch (JSONException e) {
                    e.printStackTrace();
                }



                break;
        }

    }
}
