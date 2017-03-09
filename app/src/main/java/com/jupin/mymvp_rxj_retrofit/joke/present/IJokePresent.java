package com.jupin.mymvp_rxj_retrofit.joke.present;

import com.jupin.mymvp_rxj_retrofit.joke.model.JokeBean;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public interface IJokePresent {
    void showMsg(String msg);
    void showEmpty();
    void showData(List<JokeBean> list);
}
