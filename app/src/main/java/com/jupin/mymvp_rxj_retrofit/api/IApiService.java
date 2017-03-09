package com.jupin.mymvp_rxj_retrofit.api;

import com.jupin.mymvp_rxj_retrofit.history.model.RepoHistory;
import com.jupin.mymvp_rxj_retrofit.joke.model.RepoJoke;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by jyj on 2017/3/7.
 */
public interface IApiService {
/**
 * 历史上的今天 http://api.juheapi.com/japi/toh?key=7ac7e02ff7f1f8f1ccdc2f9e5dddb6be&v=1.0&month=11&day=1*/
/**
 * 笑话大全 http://japi.juhe.cn/joke/content/list.from?key=d796a03545bddee0b56d913111f5f199&page=2&pagesize=10&sort=asc&time=1418745237 */
    @GET("/japi/toh")
    public Observable<RepoHistory> getObservalSearchHistory(@QueryMap Map<String,String> map);

    @GET("/joke/content/list.from")
    public Observable<RepoJoke> getObservalSearchJoke(@QueryMap Map<String,String> map);


}
