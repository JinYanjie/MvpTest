package com.jupin.mymvp_rxj_retrofit.joke.present;

import com.jupin.mymvp_rxj_retrofit.base.BasePresenter;
import com.jupin.mymvp_rxj_retrofit.joke.model.JokeBean;
import com.jupin.mymvp_rxj_retrofit.joke.model.JokeModel;
import com.jupin.mymvp_rxj_retrofit.joke.view.IJokeView;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public class JokePresent implements BasePresenter<IJokeView>,IJokePresent {
    private JokeModel jokeModel;
    private IJokeView jokeView;

    public JokePresent(IJokeView jokeView) {
        attachView(jokeView);
        jokeModel=new JokeModel(this);
    }

    @Override
    public void detachView() {
        jokeView=null;
    }

    @Override
    public void attachView(IJokeView iJokeView) {
        this.jokeView=iJokeView;
    }

    @Override
    public void showMsg(String msg) {
        jokeView.showMsg(msg);
    }

    @Override
    public void showEmpty() {
        jokeView.dismiss();
        jokeView.showEmpty();
    }

    @Override
    public void showData(List<JokeBean> list) {
        jokeView.dismiss();
        jokeView.showData(list);
    }

    public void searchJoke(String page){
        jokeView.loading();
        jokeModel.searchJoke(page);

    }
}
