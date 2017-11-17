package sun.sundy.functiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sun.sundy.functiontest.utils.voice.TextToSpeechUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextToSpeechUtil speechUtil = new TextToSpeechUtil(this);
        speechUtil.speakXunFei("你说什么？");
    }
}
