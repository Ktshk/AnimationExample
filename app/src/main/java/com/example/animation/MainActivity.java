package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Показываем анимированного крабика
        View image = findViewById(R.id.heroImage);
        image.setBackgroundResource(R.drawable.hero_animation);
        AnimationDrawable animation = (AnimationDrawable) image.getBackground();
        animation.start();
    }
}