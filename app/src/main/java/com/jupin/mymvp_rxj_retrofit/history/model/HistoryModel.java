package com.jupin.mymvp_rxj_retrofit.history.model;

import com.jupin.mymvp_rxj_retrofit.api.ApiUtils;
import com.jupin.mymvp_rxj_retrofit.base.BaseModel;
import com.jupin.mymvp_rxj_retrofit.history.present.IHistoryPresent;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by jyj on 2017/3/7.
 */
public class HistoryModel extends BaseModel<IHistoryPresent> {

    public HistoryModel(IHistoryPresent present) {
        super(present);
    }

    public void searchHistory(String month,String day){
        if (month==null){
            present.showMsg("");
            return;
        }
        int m= Integer.parseInt(month);
        if (m<=0||m>12){
            present.showMsg("");
            return;
        }

        if (day==null){
            present.showMsg("");
            return;
        }
        int d= Integer.parseInt(day);
        if (m<=0||m>12){
            present.showMsg("");
            return;
        }

        ApiUtils.searchHistory(month, day)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Action1<RepoHistory>() {
                    @Override
                    public void call(RepoHistory repoHistory) {
                        if (repoHistory==null||repoHistory.getResult()==null
                                ||repoHistory.getResult().size()<=0){
                            present.showEmpty();
                        }else {
                            present.showData(repoHistory.getResult());
                        }
                    }
                });

    }
}
