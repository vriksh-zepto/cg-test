package com.awesomeproject.CustomerGlu;


import android.util.Log;

import com.customerglu.sdk.CustomerGlu;
import com.facebook.react.bridge.ReactApplicationContext;

public class CustomerGLU {
    public static void showPIP(ReactApplicationContext cont) {
        CustomerGlu.getInstance().showPIP(cont.getCurrentActivity());
    }
}
