package com.jupin.mymvp_rxj_retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jupin.mymvp_rxj_retrofit.history.ui.HistoryActivity;
import com.jupin.mymvp_rxj_retrofit.joke.ui.JokeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_history)
    Button btnHistory;
    @BindView(R.id.btn_joke)
    Button btnJoke;

    //1.根据网址，建立model
//2.apiService 建立请求
//3.apiBase  配置retrofit
//4.建立一个apiUtils
//5.由于多次访问都需要model、activity、view。因此建立各自基类。
//6.model基类主要是包含present.view基类就登录和消失。Activity要同时拥有present和view的对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_history, R.id.btn_joke})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_history:
                startActivity(new Intent(MainActivity.this, HistoryActivity.class));
                break;
            case R.id.btn_joke:
                startActivity(new Intent(MainActivity.this, JokeActivity.class));
                break;
        }
    }
}
