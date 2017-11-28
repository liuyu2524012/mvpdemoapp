package com.cn.demo.presenter;

import com.cn.demo.model.DemoMVPActModel;
import com.cn.demo.model.IDemoMVPActModel;
import com.cn.demo.view.DemoMVPActivity;
import com.cn.demo.view.IDemoMVPActView;

/**
 * 代理层
 * Created by yanliu on 2017/11/27.
 */

public class DemoMVPActPresenter implements IDemoMVPActPresenter {


    IDemoMVPActView mView;
    IDemoMVPActModel mModel;

    public DemoMVPActPresenter() {
        mView = new DemoMVPActivity();
        mModel = new DemoMVPActModel();
    }

}
