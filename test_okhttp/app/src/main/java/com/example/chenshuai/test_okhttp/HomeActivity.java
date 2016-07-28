package com.example.chenshuai.test_okhttp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenshuai on 2016/7/27.
 */
public class HomeActivity extends Activity {
    private ListView mListView;
    private List list = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        mListView = (ListView) findViewById(R.id.listview);

    }
}
