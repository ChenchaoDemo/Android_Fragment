package com.example.chen.wangketong.fragment;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.chen.wangketong.R;

/**
 * Created by Chen on 2020/8/10.
 */

public class MyFragment extends Fragment implements View.OnClickListener{
    private Context mcontext;
    private EditText username;
    private EditText password;
    private TextView login;
    private EditText insertFeedback;
    private TextView feedback;
    public MyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        mcontext=getContext();
        username = (EditText)view.findViewById(R.id.username);
        password = (EditText)view.findViewById(R.id.password);
        login = (TextView)view.findViewById(R.id.login);
        insertFeedback = (EditText)view.findViewById(R.id.insert_feedback);
        feedback = (TextView)view.findViewById(R.id.feedback);
        login.setOnClickListener(this);
        feedback.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:

                break;
            case R.id.feedback:
                break;
        }
    }
}

