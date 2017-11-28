package com.cn.demo.model;

import com.cn.demo.listener.IDemoMVPActCallbackListener;

/**
 *
 * 数据控制层
 * Created by yanliu on 2017/11/27.
 */

public interface IDemoMVPActModel {
    void getData(IDemoMVPActCallbackListener listener);
}
