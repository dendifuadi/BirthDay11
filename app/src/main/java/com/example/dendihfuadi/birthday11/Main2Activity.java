package com.example.dendihfuadi.birthday11;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    ToggleButton toggleButton;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hbdsong2);
        //inisialisasi viewnya vruh

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = toggleButton.isChecked();

                if (checked){
                    mediaPlayer.start();
                    imageView.setVisibility(View.INVISIBLE);
                    imageView1.setVisibility(View.VISIBLE);


                }
                else {
                    mediaPlayer.stop();
                    imageView.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.INVISIBLE);

                }
            }
        }
        );

    }
}
