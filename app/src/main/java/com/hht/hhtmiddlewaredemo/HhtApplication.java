package com.hht.hhtmiddlewaredemo;

import android.app.Application;

import com.hht.hhttvmiddleware.manager.HHTDeviceManager;

/**
 * Author：wufq on 2018/4/24 15:42
 * Email：wufeiqing@@honghe-tech.com
 *
 * @TODO:
 */

public class HhtApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        HHTDeviceManager.getInstance().init(getApplicationContext());
        HHTDeviceManager.INSTANCE.init(getApplicationContext());
    }
}
