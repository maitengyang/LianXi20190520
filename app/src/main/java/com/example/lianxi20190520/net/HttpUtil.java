package com.example.lianxi20190520.net;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lianxi20190520.api.AllApplication;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/5/20
 *@Time:21:35
 *@Description:作用:
 * */public class HttpUtil {
    private static final HttpUtil ourInstance = new HttpUtil();

    public static HttpUtil getInstance() {
        return ourInstance;
    }

    private HttpUtil() {
    }
    public void doHttpGet(String urlM, final NetCallBack netCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.GET, urlM, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                netCallBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                netCallBack.onFail(error.getMessage());
            }
        });
        AllApplication.requestQueue().add(stringRequest);
    }
}
