package com.cn.demo.view;

import android.app.Activity;
import android.os.Bundle;

import demo.com.cn.mvpdemoapp.R;

/**
 * 视图层
 * Created by liuyu on 2017/11/27.
 */

public class DemoMVPActivity extends Activity implements IDemoMVPActView, DemoMVPActViewListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
