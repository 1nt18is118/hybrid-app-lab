package com.example.purnima_songplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
Button play,forward,rewind,stop,reset;
MediaPlayer mediaPlayer;
TextView songtitle;
int starttime=0;
int stoptime=0;
int forwardtime=5000;
int backwardtime=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(this,R.raw.song);
        songtitle=findViewById(R.id.songtitle);

        songtitle.setText("song.mp3");
        play=findViewById(R.id.play);
        stop=findViewById(R.id.pause);
        reset=findViewById(R.id.restart);
        rewind=findViewById(R.id.rewind);
        forward=findViewById(R.id.forward);
        play.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(MainActivity.this,"Playing Media Now",Toast.LENGTH_SHORT).show();
                     mediaPlayer.start();
                 }
             });
             reset.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     mediaPlayer.reset();
                     mediaPlayer.start();
                 }
             });
             forward.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     int curpos=mediaPlayer.getCurrentPosition();
                     if((curpos+forwardtime)<=(stoptime=mediaPlayer.getDuration()))
                     {
                         mediaPlayer.seekTo(curpos+forwardtime);
                     }
                 }
             });
    }
}