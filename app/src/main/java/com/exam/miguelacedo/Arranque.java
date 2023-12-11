package com.exam.miguelacedo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Arranque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);

        ImageView logoSplash = findViewById(R.id.logoSS);

        Animation logoAnimation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        logoSplash.startAnimation(logoAnimation);

        ImageView background = findViewById(R.id.backgroundSS);
        Glide.with(this)
                .load("https://media.istockphoto.com/id/1135480621/es/foto/polvo-de-color-holi-colores-gulal-org%C3%A1nicos-en-cuenco-para-el-festival-holi-tradici%C3%B3n-hind%C3%BA.webp?b=1&s=170667a&w=0&k=20&c=gAtXc3bc3nMWjEpPz5DSFHOUjAXeB0MMmwb59g0WOPo=")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .fitCenter() // o centerCorp() para que se ponga en el centro de la img
                .into(background);

        openLogin();


    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, Acceso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        },2500);

    }
}