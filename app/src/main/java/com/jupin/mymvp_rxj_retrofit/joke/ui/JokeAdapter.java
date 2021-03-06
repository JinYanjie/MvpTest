package com.jupin.mymvp_rxj_retrofit.joke.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dou361.recyclerview.adapter.BaseRecyclerViewAdapter;
import com.dou361.recyclerview.hodler.BaseViewHolder;
import com.jupin.mymvp_rxj_retrofit.R;
import com.jupin.mymvp_rxj_retrofit.joke.model.JokeBean;

import java.util.List;

/**
 * Created by jyj on 2017/3/7.
 */
public class JokeAdapter extends BaseRecyclerViewAdapter<JokeBean> {

    public JokeAdapter(Context mContext, List<JokeBean> mDatas) {
        super(mContext, mDatas);
    }

    @Override
    public BaseViewHolder getItemHolder(View contentView, int viewType) {
        return new JokeItemHolder(mContext,mListener,contentView);
    }

    @Override
    public View onCreateContentView(ViewGroup parent, int viewType) {
        return LayoutInflater.from(mContext).inflate(R.layout.holder_item_joke
        ,parent,false);
    }
}
