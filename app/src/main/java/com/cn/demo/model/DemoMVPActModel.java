package com.cn.demo.model;

import com.cn.demo.listener.IDemoMVPActCallbackListener;

import java.util.Random;

/**
 * model层的实现类
 * Created by yanliu on 2017/11/27.
 */

public class DemoMVPActModel implements IDemoMVPActModel {

    String mData;
    Random random=new Random();


    @Override
    public void getData(IDemoMVPActCallbackListener listener) {
        if (random.nextInt(100)%2==0){//这里模拟取数据搞了一个随机数 如果是双数则表示网络取数据，单数则表示本地缓存
            mData="我是从服务器来的数据";
            listener.onNetSuccess(mData);
        }else {
            mData="我是从本地缓存来的数据";
            listener.onNativeSuccess(mData);
        }
    }
}
