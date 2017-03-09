package com.jupin.mymvp_rxj_retrofit.api;

import com.dou361.retrofit2.converter.fastjson.FastJsonConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by jyj on 2017/3/7.
 */
public class ApiBase {
    public static IApiService getApiService(){
        return getApiService(null);
    }

    public static IApiService getApiService(String ip){
        return getApiService(ip,0,0);
    }
    public static IApiService getApiService(String ip,long readTime,long connectTime){
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .readTimeout(readTime<=0?30:readTime, TimeUnit.SECONDS)
                .connectTimeout(connectTime<=0?30:connectTime,TimeUnit.SECONDS)
                .build();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(ip==null?"http://api.juheapi.com":ip)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(FastJsonConverterFactory.create())
                .build();
        return retrofit.create(IApiService.class);
    }
}
