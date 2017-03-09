package com.jupin.mymvp_rxj_retrofit.api;

import com.jupin.mymvp_rxj_retrofit.history.model.RepoHistory;
import com.jupin.mymvp_rxj_retrofit.joke.model.RepoJoke;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;

/**
 * Created by jyj on 2017/3/7.
 */
public class ApiUtils extends ApiBase{
    public static Observable<RepoHistory> searchHistory(String month,String day){
        Map<String,String> map=new HashMap<>();
        map.put("key", "7ac7e02ff7f1f8f1ccdc2f9e5dddb6be");
        map.put("v", "1.0");
        map.put("month", month);
        map.put("day", day);
       return getApiService().getObservalSearchHistory(map);
    }

    public static Observable<RepoJoke> searchJoke(String page){
        String ip="http://japi.juhe.cn";
        Map<String,String> map=new HashMap<>();
        map.put("key","d796a03545bddee0b56d913111f5f199");
        map.put("page",page);
        map.put("pagesize","10");
        map.put("sort","asc");
        map.put("time","1418745237");
        return getApiService().getObservalSearchJoke(map);
    }

}
