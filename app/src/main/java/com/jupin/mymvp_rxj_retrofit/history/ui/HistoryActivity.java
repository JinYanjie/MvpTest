package com.jupin.mymvp_rxj_retrofit.history.ui;

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
import com.jupin.mymvp_rxj_retrofit.history.model.HistoryBean;
import com.jupin.mymvp_rxj_retrofit.history.present.HistoryPresent;
import com.jupin.mymvp_rxj_retrofit.history.view.IHistoryView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jyj on 2017/3/7.
 */
public class HistoryActivity extends BaseMVPActivity<IHistoryView, HistoryPresent> implements IHistoryView {


    @BindView(R.id.et_month)
    EditText etMonth;
    @BindView(R.id.et_day)
    EditText etDay;
    @BindView(R.id.btn_search)
    Button btnSearch;
    @BindView(R.id.rlv_history)
    RecyclerView rlvHistory;
    @BindView(R.id.ll_empty)
    LinearLayout llEmpty;
    @BindView(R.id.ll_loading)
    LinearLayout llLoading;
    @BindView(R.id.activity_history)
    LinearLayout activityHistory;

    @NonNull
    @Override
    public HistoryPresent creatPresent() {
        return new HistoryPresent(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);
    }

    @Override
    public void showData(List<HistoryBean> list) {
        rlvHistory.setLayoutManager(new LinearLayoutManager(this));
        rlvHistory.setItemAnimator(new DefaultItemAnimator());
        rlvHistory.setHasFixedSize(true);
        rlvHistory.setAdapter(new HistoryAdapter(this,list));
    }

    @Override
    public void showMsg(String msg) {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void loading() {

    }

    @Override
    public void dismiss() {

    }

    @OnClick(R.id.btn_search)
    public void onClick() {
        getPresent().searchHistory(etMonth.getText().toString().trim(),etDay.getText().toString().trim());
    }
}
