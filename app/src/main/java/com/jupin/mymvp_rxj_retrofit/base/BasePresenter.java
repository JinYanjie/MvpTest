package com.jupin.mymvp_rxj_retrofit.base;

/**
 * Created by jyj on 2017/3/7.
 */
public interface BasePresenter<V extends IBaseView> {
    void detachView();
    void attachView(V v);
}
