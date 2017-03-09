package com.jupin.mymvp_rxj_retrofit.history.present;

import com.jupin.mymvp_rxj_retrofit.history.model.HistoryBean;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public interface IHistoryPresent {
    void showMsg(String msg);
    void showEmpty();
    void showData(List<HistoryBean> list);
}
