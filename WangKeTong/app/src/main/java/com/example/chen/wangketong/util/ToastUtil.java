package com.example.chen.wangketong.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Chen on 2020/8/11.
 */

public class ToastUtil {
    public static void showToast(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
