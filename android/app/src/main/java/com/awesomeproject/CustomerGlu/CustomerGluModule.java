package com.awesomeproject.CustomerGlu;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CustomerGluModule extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactApplicationContext;
    public CustomerGluModule (ReactApplicationContext reactApplicationContext) {
        this.reactApplicationContext = reactApplicationContext;
    }
    @NonNull
    @Override
    public String getName() {
        return "CustomerGluInternal";
    }

    @ReactMethod
    public void showPIP() {
        CustomerGLU.showPIP(reactApplicationContext);
    }
}
