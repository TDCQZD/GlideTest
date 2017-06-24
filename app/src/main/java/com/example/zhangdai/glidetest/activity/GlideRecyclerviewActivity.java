package com.example.zhangdai.glidetest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zhangdai.glidetest.R;
import com.example.zhangdai.glidetest.adapter.GlideRecyclerviewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 在RecyclerView列表中使用Glide
 */
public class GlideRecyclerviewActivity extends AppCompatActivity {

    @BindView(R.id.rv_glide)
    RecyclerView rvGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recyclerview);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {

        // 初始化Recyclerview
        GlideRecyclerviewAdapter glideRecyclerviewAdapter = new GlideRecyclerviewAdapter(this);
        rvGlide.setAdapter(glideRecyclerviewAdapter);
        rvGlide.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
