package rocketly.hotfixdemo;

import android.app.Application;

/**
 * Created by zhuliyuan on 2018/10/22.
 */
public class MyApplication extends Application {

    private static MyApplication mApplication;

    public static Application getContext() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.mApplication = this;
    }
}
