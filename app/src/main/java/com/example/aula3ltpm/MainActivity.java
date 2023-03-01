package com.example.aula3ltpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgPassaro, imgTigre;
    Intent it;
    String desc[] = {"Uma descrição sobre o passaro",
            "Uma descrição sobre o tigre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPassaro = findViewById(R.id.imageView_1);
        imgTigre = findViewById(R.id.imageView_2);
        imgPassaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(MainActivity.this,DescricaoActivity.class);
                it.putExtra("texto", desc[0]);
                startActivity(it);
            }
        });

        imgTigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(MainActivity.this,DescricaoActivity.class);
                it.putExtra("texto", desc[1]);
                startActivity(it);
            }
        });


    }
}