package com.jupin.mymvp_rxj_retrofit.base;

import android.support.annotation.NonNull;

/**
 * Created by jyj on 2017/3/7.
 */
public interface IBaseDelegate<V extends IBaseView,P extends BasePresenter<V>> {
    @NonNull
    P creatPresent();

    @NonNull
    P getPresent();
}
