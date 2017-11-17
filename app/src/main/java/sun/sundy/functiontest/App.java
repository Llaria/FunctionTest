package sun.sundy.functiontest;

import android.app.Application;

/**
 *
 * Created by sundi on 2017/11/17.
 */

public class App extends Application {

    public static App application;

    @Override
    public void onCreate() {
        super.onCreate();
        initApp(this);
    }

    private void initApp(App app) {
        application = app;
    }

    public static App getInstance(){
        return application;
    }
}
