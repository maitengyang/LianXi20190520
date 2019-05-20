package com.example.lianxi20190520;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lianxi20190520.mvp.UiContract;
import com.example.lianxi20190520.mvp.uipresenter.UiPresenter;

public class MainActivity extends AppCompatActivity implements UiContract.ContractView {
public UiContract.ContractPresenter contractPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contractPresenter=new UiPresenter();
        contractPresenter.onattch(this);
        contractPresenter.getdataP("http://gank.io/api/data/%E7%A6%8F%E5%88%A9/200/1?tdsourcetag=s_pcqq_aiomsg");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        contractPresenter.ondetch();
    }

    @Override
    public void showdata(String s) {
        Log.i("TAG",s);
    }
}
