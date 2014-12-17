package com.example.anastassiyaneznanova.music;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;


public class MyActivity extends ActionBarActivity {
    MediaPlayer mp1;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mp1 = MediaPlayer.create(this, R.raw.barbie);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                mp1 = MediaPlayer.create(getApplicationContext(), R.raw.barbie);//Create MediaPlayer object with MP3 file under res/raw folder
                mp1.start();//Start playing the music
            }
        });


        b2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(mp1!=null && mp1.isPlaying()){//If music is playing already
                    mp1.stop();//Stop playing the music
                }
            }
        });


    }




        }

