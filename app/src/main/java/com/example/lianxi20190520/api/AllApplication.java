package com.example.lianxi20190520.api;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/5/20
 *@Time:21:37
 *@Description:作用:
 * */public class AllApplication extends android.app.Application {
     public static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue=Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue requestQueue() {
        return requestQueue;
    }
}
