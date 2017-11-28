package com.cn.demo.presenter;

import android.app.Activity;
import android.content.Context;

import com.cn.demo.listener.IDemoMVPActCallbackListener;
import com.cn.demo.model.DemoMVPActModel;
import com.cn.demo.model.IDemoMVPActModel;
import com.cn.demo.view.DemoMVPActivity;
import com.cn.demo.view.IDemoMVPActView;

import java.util.Random;

/**
 * 代理层
 * Created by yanliu on 2017/11/27.
 */

public class DemoMVPActPresenter implements IDemoMVPActPresenter,IDemoMVPActCallbackListener{


    IDemoMVPActView mView;
    IDemoMVPActModel mModel;

    public DemoMVPActPresenter(IDemoMVPActView view) {
        mView = view;
        mModel = new DemoMVPActModel();
    }

    @Override
    public void getDataPresenter() {
        mModel.getData(this);
    }


    @Override
    public void onNetSuccess(String mData) {
        mView.setData(mData);
    }

    @Override
    public void onNativeSuccess(String mData) {
        mView.setData(mData);
    }
}
