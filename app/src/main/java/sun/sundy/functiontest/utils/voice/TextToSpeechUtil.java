package sun.sundy.functiontest.utils.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.text.TextUtils;

import java.util.HashMap;

import sun.sundy.functiontest.utils.ToastUtils;

/**
 * 播放语音处理类
 */
@SuppressWarnings("unused")
public class TextToSpeechUtil {

	private SoundPool soundPool;
	private HashMap<Integer, Integer> soundPoolMap;
	private SpeakXunFeiUtil speakXunFeiUtil;// 讯飞TTS

	public TextToSpeechUtil(Context context) {
		// initSoundPool(context);
		initXunFeiSpeech(context);
	}

	/**
	 * =======================以下:讯飞TTS=======================
	 */
    private void initXunFeiSpeech(Context context) {
		speakXunFeiUtil = new SpeakXunFeiUtil(context);
	}

	/**
	 * 讯飞 播放语音
	 */
	public void speakXunFei(String message) {
		if (speakXunFeiUtil != null && !TextUtils.isEmpty(message)) {
			speakXunFeiUtil.Speak(message, SpeakXunFeiUtil.SPEAK_TYPE_FLUSH);
            ToastUtils.showLazzToast(message);
		}
	}

	/**
	 * =======================以下:播放声音部分=======================
	 */
	@SuppressLint("UseSparseArrays")
    private void initSoundPool(Context context) {
		soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 100);
		soundPoolMap = new HashMap<>();
		// soundPoolMap.put(1, soundPool.load(context, R.raw.ok, 1));// 正确
		// soundPoolMap.put(2, soundPool.load(context, R.raw.error, 2));// 错误
	}

	/**
	 * 正确
	 */
	public void soundPoolOk() {
		if (soundPool != null)
			soundPool.play(soundPoolMap.get(1), 1.0f, 1.0f, 1, 0, 1f);
	}

	/**
	 * 错误
	 */
	public void soundPoolError() {
		if (soundPool != null)
			soundPool.play(soundPoolMap.get(2), 1.0f, 1.0f, 1, 0, 1f);
	}
}
