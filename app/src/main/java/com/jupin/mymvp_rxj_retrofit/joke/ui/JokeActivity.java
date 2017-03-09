package com.jupin.mymvp_rxj_retrofit.joke.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.jupin.mymvp_rxj_retrofit.R;
import com.jupin.mymvp_rxj_retrofit.base.BaseMVPActivity;
import com.jupin.mymvp_rxj_retrofit.joke.model.JokeBean;
import com.jupin.mymvp_rxj_retrofit.joke.present.JokePresent;
import com.jupin.mymvp_rxj_retrofit.joke.view.IJokeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jyj on 2017/3/7.
 */
public class JokeActivity extends BaseMVPActivity<IJokeView, JokePresent> implements IJokeView {
    @BindView(R.id.et_page)
    EditText etPage;
    @BindView(R.id.btn_load)
    Button btnLoad;
    @BindView(R.id.rlv_joke)
    RecyclerView rlvJoke;
    @BindView(R.id.ll_empty)
    LinearLayout llEmpty;
    @BindView(R.id.ll_loading)
    LinearLayout llLoading;
    @BindView(R.id.activity_history)
    LinearLayout activityHistory;

    @NonNull
    @Override
    public JokePresent creatPresent() {
        return new JokePresent(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        ButterKnife.bind(this);
    }

    @Override
    public void showMsg(String msg) {
        mPresent.showMsg(msg);
    }

    @Override
    public void showEmpty() {
        mPresent.showEmpty();
    }

    @Override
    public void showData(List<JokeBean> list) {
        rlvJoke.setLayoutManager(new LinearLayoutManager(this));
        rlvJoke.setHasFixedSize(true);
        rlvJoke.setItemAnimator(new DefaultItemAnimator());
        rlvJoke.setAdapter(new JokeAdapter(this,list));
    }

    @Override
    public void loading() {

    }

    @Override
    public void dismiss() {

    }

    @OnClick(R.id.btn_load)
    public void onClick() {
        getPresent().searchJoke(etPage.getText().toString().trim());
    }
}
