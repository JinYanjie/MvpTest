package com.jupin.mymvp_rxj_retrofit.joke.model;

import com.jupin.mymvp_rxj_retrofit.api.ApiUtils;
import com.jupin.mymvp_rxj_retrofit.base.BaseModel;
import com.jupin.mymvp_rxj_retrofit.joke.present.IJokePresent;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by jyj on 2017/3/7.
 */
public class JokeModel extends BaseModel<IJokePresent> {

    public JokeModel(IJokePresent present) {
        super(present);
    }

    public void searchJoke(String page){
        if (page==null){
            present.showMsg("");
            return;
        }
        int p= Integer.parseInt(page);
        if (p<=0){
            present.showMsg("");
            return;
        }
        ApiUtils.searchJoke(page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Action1<RepoJoke>() {
                    @Override
                    public void call(RepoJoke repoJoke) {
                        if (repoJoke==null||repoJoke.getResult()==null
                                ||repoJoke.getResult().getData()==null
                                ||repoJoke.getResult().getData().size()<=0){
                            present.showEmpty();
                        }else {
                            present.showData(repoJoke.getResult().getData());
                        }
                    }
                });
    }

}
