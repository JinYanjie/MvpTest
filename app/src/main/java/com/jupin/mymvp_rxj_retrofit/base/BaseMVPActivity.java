package com.jupin.mymvp_rxj_retrofit.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jyj on 2017/3/7.
 */
public abstract class BaseMVPActivity <V extends IBaseView,P extends BasePresenter<V>>
        extends AppCompatActivity implements IBaseDelegate<V,P>{
    protected  P mPresent;


    @NonNull
    @Override
    public P getPresent() {
        return mPresent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresent=creatPresent();
    }

    @Override
    protected void onDestroy() {
        mPresent.detachView();
        super.onDestroy();

    }
}
