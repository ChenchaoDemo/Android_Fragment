package com.example.chen.wangketong.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chen.wangketong.R;

/**
 * Created by Chen on 2020/8/10.
 */

public class OrdersFragment extends Fragment {
    private Context mContext;
    public OrdersFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View ordersView = inflater.inflate(R.layout.fragment_orders, container, false);
        mContext=getContext();

        return ordersView;
    }
}

