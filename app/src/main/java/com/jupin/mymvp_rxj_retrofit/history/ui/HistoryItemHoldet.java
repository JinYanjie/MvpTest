package com.jupin.mymvp_rxj_retrofit.history.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.dou361.recyclerview.hodler.BaseViewHolder;
import com.dou361.recyclerview.listener.OnItemClickListener;
import com.jupin.mymvp_rxj_retrofit.R;
import com.jupin.mymvp_rxj_retrofit.history.model.HistoryBean;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jyj on 2017/3/7.
 */
public class HistoryItemHoldet extends BaseViewHolder<HistoryBean> {
    @BindView(R.id.tv_content)
    TextView content;
    @BindView(R.id.tv_title)
    TextView title;

    public HistoryItemHoldet(Context mContext, OnItemClickListener listener, View itemView) {
        super(mContext, listener, itemView);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void refreshView() {
        HistoryBean data=getData();
        content.setText(data.getDes());
        title.setText(data.getTitle());
    }
}
