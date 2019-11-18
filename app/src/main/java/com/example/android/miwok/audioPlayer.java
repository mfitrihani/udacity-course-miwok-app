package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;

public class audioPlayer {
    private int audioId;
    private Context context;

    public audioPlayer(int audioId, Context context){
        this.context = context;
        this.audioId = audioId;
    }

    public void play(){
        MediaPlayer play = MediaPlayer.create(context,audioId);
        play.start();
    }
}
