package com.jupin.mymvp_rxj_retrofit.base;

/**
 * Created by jyj on 2017/3/7.
 */
public abstract class BaseModel<IP> {
    protected   IP present;

    public BaseModel(IP present) {
        this.present = present;
    }
}
