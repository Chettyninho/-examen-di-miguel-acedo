package com.exam.miguelacedo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        ImageView background = findViewById(R.id.backgroundAcceso);
        Glide.with(this)
                .load("https://media.istockphoto.com/id/589976476/es/foto/fondo-vegetal-de-tiras-multicolores-de-cinco-especies-de-pimientos.jpg?s=612x612&w=0&k=20&c=7K601HIlzBSTQC83LZnDg6RCyv0TbnryVZJc6PPrVjY=")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .fitCenter() // o centerCorp() para que se ponga en el centro de la img
                .into(background);
    }
}