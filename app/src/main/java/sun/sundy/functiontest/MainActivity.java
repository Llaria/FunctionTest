package sun.sundy.functiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import sun.sundy.functiontest.utils.sound.SpeechSoundManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) {
//        TextToSpeechUtil speechUtil = new TextToSpeechUtil(this);
//        speechUtil.speakXunFei("你说什么？");

        try {
            SpeechSoundManager.getInstance().startSpeech("该包为混包");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
