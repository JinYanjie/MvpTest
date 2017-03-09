package com.jupin.mymvp_rxj_retrofit.history.present;

import com.jupin.mymvp_rxj_retrofit.base.BasePresenter;
import com.jupin.mymvp_rxj_retrofit.history.model.HistoryBean;
import com.jupin.mymvp_rxj_retrofit.history.model.HistoryModel;
import com.jupin.mymvp_rxj_retrofit.history.view.IHistoryView;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public class HistoryPresent implements BasePresenter<IHistoryView>,IHistoryPresent {
    private HistoryModel model;
    private IHistoryView view;

    public HistoryPresent(IHistoryView view) {
        attachView(view);
        model=new HistoryModel(this);
    }

    @Override
    public void showMsg(String msg) {
        view.showMsg(msg);
    }

    @Override
    public void showEmpty() {
        view.dismiss();
        view.showEmpty();
    }

    @Override
    public void showData(List<HistoryBean> list) {
        view.dismiss();
        view.showData(list);
    }

    @Override
    public void detachView() {
        this.view=null;
    }

    @Override
    public void attachView(IHistoryView iHistoryView) {
        this.view=iHistoryView;
    }

    public void searchHistory(String m,String d){
        view.loading();
        model.searchHistory(m, d);
    }
}
