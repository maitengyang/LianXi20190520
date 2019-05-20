package com.example.lianxi20190520.mvp.uipresenter;

import com.example.lianxi20190520.mvp.UiContract;
import com.example.lianxi20190520.mvp.uimodel.UiModel;
import com.example.lianxi20190520.net.NetCallBack;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/5/20
 *@Time:22:10
 *@Description:作用:
 * */public class UiPresenter implements UiContract.ContractPresenter {
     public UiContract.ContractModel contractModel;
     public UiContract.ContractView contractView;
    @Override
    public void onattch(UiContract.ContractView contractView) {
        contractModel=new UiModel();
        this.contractView=contractView;
    }

    @Override
    public void ondetch() {
        if (contractModel!=null){
            contractModel=null;
        }
        if (contractView!=null){
            contractView=null;
        }
    }

    @Override
    public void getdataP(String urlM) {
        contractModel.getdataM(urlM, new NetCallBack() {
            @Override
            public void onSuccess(String s) {
                contractView.showdata(s);
            }

            @Override
            public void onFail(String s) {

            }
        });
    }
}
