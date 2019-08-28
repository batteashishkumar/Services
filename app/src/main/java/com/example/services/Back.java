package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class Back extends Service {

    MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        player = MediaPlayer.create(this, R.raw.song);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
    }
    @Override
    public void onStart(Intent intent, int startid) {
    MainActivity.getInstance().change_text("song is playing.........");
        player.start();

    }
    @Override
    public void onDestroy() {
        MainActivity.getInstance().change_default("song is stopped.........");
        player.stop();
        player.release();
    }


}
