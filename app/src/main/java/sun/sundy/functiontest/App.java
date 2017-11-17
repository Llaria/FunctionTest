package sun.sundy.functiontest;

import android.app.Application;

import sun.sundy.functiontest.utils.ToastUtils;
import sun.sundy.functiontest.utils.sound.SpeechSoundManager;

/**
 *
 * Created by sundi on 2017/11/17.
 */

public class App extends Application {

    public static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        initApp(this);
        try {
            boolean installed = SpeechSoundManager.getInstance()
                    .initSpeechService();
            if (!installed)
                ToastUtils.showLazzToast("请确认是否安装讯飞语音+");
        } catch (Exception e) {
            e.printStackTrace();
            ToastUtils.showLazzToast("请确认是否安装讯飞语音+");
        }
    }

    private void initApp(App application) {
        app = application;
    }

    public static App getInstance(){
        return app;
    }
}
