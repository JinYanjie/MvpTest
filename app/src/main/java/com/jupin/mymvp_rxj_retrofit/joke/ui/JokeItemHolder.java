package com.jupin.mymvp_rxj_retrofit.joke.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.dou361.recyclerview.hodler.BaseViewHolder;
import com.dou361.recyclerview.listener.OnItemClickListener;
import com.jupin.mymvp_rxj_retrofit.R;
import com.jupin.mymvp_rxj_retrofit.joke.model.JokeBean;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jyj on 2017/3/7.
 */
public class JokeItemHolder extends BaseViewHolder<JokeBean> {
    @BindView(R.id.tv_content)
    TextView content;
    @BindView(R.id.tv_title)
    TextView tittle;

    public JokeItemHolder(Context mContext, OnItemClickListener listener, View itemView) {
        super(mContext, listener, itemView);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void refreshView() {
        JokeBean data=getData();
        tittle.setText(data.getUpdatetime());
        content.setText(data.getContent());
    }
}
