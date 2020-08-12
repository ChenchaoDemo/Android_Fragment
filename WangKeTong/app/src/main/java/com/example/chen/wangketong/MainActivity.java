package com.example.chen.wangketong;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.chen.wangketong.fragment.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {
    //UI Objects

    private RadioGroup rg_tab_bar;
    private RadioButton rb_home;
    private RadioButton rb_orders;
    private RadioButton rb_help;
    private RadioButton rb_my;
    private ViewPager vpager;

    private MyFragmentPagerAdapter mAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_home.setChecked(true);

    }
    private void bindViews() {
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_home = (RadioButton) findViewById(R.id.rb_home);
        rb_orders = (RadioButton) findViewById(R.id.rb_orders);
        rb_help = (RadioButton) findViewById(R.id.rb_help);
        rb_my = (RadioButton) findViewById(R.id.rb_my);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }
    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_home.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_orders.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_help.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_my.setChecked(true);
                    break;
            }
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_home:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_orders:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_help:
                vpager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_my:
                vpager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }

}
