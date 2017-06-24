package com.example.zhangdai.glidetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhangdai.glidetest.activity.GlideBaseActivity;
import com.example.zhangdai.glidetest.activity.GlideRecyclerviewActivity;
import com.example.zhangdai.glidetest.activity.GlideTranformationsActivity;

/**
 * 图片加载框架Glide的使用
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btGlideBase;
    private Button btGlideRecyclerview;
    private Button btGlideTranfromations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }



    private void findViews() {
        btGlideBase = (Button)findViewById( R.id.bt_glide_base );
        btGlideRecyclerview = (Button)findViewById( R.id.bt_glide_recyclerview );
        btGlideTranfromations = (Button)findViewById( R.id.bt_glide_tranfromations );

        btGlideBase.setOnClickListener( this );
        btGlideRecyclerview.setOnClickListener( this );
        btGlideTranfromations.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == btGlideBase ) {
            // 基础用法
            startActivity(new Intent(MainActivity.this,GlideBaseActivity.class));
        } else if ( v == btGlideRecyclerview ) {
            // Recyclerview中使用
            startActivity(new Intent(MainActivity.this,GlideRecyclerviewActivity.class));
        } else if ( v == btGlideTranfromations ) {
            // 图形变换
            startActivity(new Intent(MainActivity.this,GlideTranformationsActivity.class));
        }
    }

}
