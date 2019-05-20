package com.example.lianxi20190520.mvp;

import com.example.lianxi20190520.net.NetCallBack;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/5/20
 *@Time:21:51
 *@Description:作用:
 * */public interface UiContract {
     public interface ContractView{
         void showdata(String s);
     }
     public interface ContractModel{
         void getdataM(String urlM, NetCallBack netCallBack);
     }
     public interface ContractPresenter{
         void onattch(ContractView contractView);
         void ondetch();
         void getdataP(String urlM);
     }
}
