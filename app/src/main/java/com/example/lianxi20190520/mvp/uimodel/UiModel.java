package com.example.lianxi20190520.mvp.uimodel;

import com.example.lianxi20190520.mvp.UiContract;
import com.example.lianxi20190520.net.HttpUtil;
import com.example.lianxi20190520.net.NetCallBack;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/5/20
 *@Time:22:10
 *@Description:作用:
 * */public class UiModel implements UiContract.ContractModel {
     public HttpUtil httpUtil;
     public UiModel() {
        httpUtil=HttpUtil.getInstance();
    }

    @Override
    public void getdataM(String urlM, NetCallBack netCallBack) {
         httpUtil.doHttpGet(urlM,netCallBack);
    }
}
