package com.cn.demo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cn.demo.presenter.DemoMVPActPresenter;
import com.cn.demo.presenter.IDemoMVPActPresenter;

import demo.com.cn.mvpdemoapp.R;

/**
 * 视图层
 * Created by liuyu on 2017/11/27.
 */

public class DemoMVPActivity extends AppCompatActivity implements IDemoMVPActView{

    IDemoMVPActPresenter mPresenter;
    Button mClickBt;
    TextView mViewText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new DemoMVPActPresenter(this);//创建presenter实例
        mClickBt =findViewById(R.id.pleaseClick);
        mViewText = findViewById(R.id.clickText);
        mClickBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });
    }


    @Override
    public void getData() {
        mPresenter.getDataPresenter();//用代理者去执行逻辑
    }

    @Override
    public void setData(String mData) {
        mViewText.setText(mData.toString());
    }

}
