package com.exam.miguelacedo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Acceso extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        logo = findViewById(R.id.mainImage);
        ImageView background = findViewById(R.id.backgroundAcceso);
        Glide.with(this)
                .load("https://media.istockphoto.com/id/589976476/es/foto/fondo-vegetal-de-tiras-multicolores-de-cinco-especies-de-pimientos.jpg?s=612x612&w=0&k=20&c=7K601HIlzBSTQC83LZnDg6RCyv0TbnryVZJc6PPrVjY=")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .fitCenter() // o centerCorp() para que se ponga en el centro de la img
                .into(background);

        Button registerButton = (Button) findViewById(R.id.registerButton);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        registerButton.setOnClickListener(view -> openRegister());
        loginButton.setOnClickListener(view -> openMain());
    }
    public void openMain() {
        Intent intent = new Intent(Acceso.this, Main.class);
        startActivity(intent);
    }

    public void openRegister(){
        Intent intent = new Intent(Acceso.this, Register.class);
        startActivity(intent);
    }
}