package com.jupin.mymvp_rxj_retrofit.history.view;

import com.jupin.mymvp_rxj_retrofit.base.IBaseView;
import com.jupin.mymvp_rxj_retrofit.history.model.HistoryBean;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public interface IHistoryView extends IBaseView{
    void showData(List<HistoryBean> list);
    void showMsg(String msg);
    void showEmpty();
}
