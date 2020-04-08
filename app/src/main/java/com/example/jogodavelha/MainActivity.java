package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogador = 0;
    }
    ImageView imageView;
    int jogador;

    public void dropIn(View view) {

        imageView = (ImageView) view;
        imageView.setTranslationY(-1000f);

        if (jogador == 0) {
            imageView.setImageResource(R.drawable.lannister);
            jogador=1;
        }
        else{
            imageView.setImageResource(R.drawable.stark);
            jogador=0;
        }

        imageView.animate().translationYBy(1000f).rotationXBy(1440f).setDuration(1500);
    }
}
