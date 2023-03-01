package com.example.aula3ltpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DescricaoActivity extends AppCompatActivity {
    Button botao;
    TextView txtDesc;
    Intent it;
    String descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao);

        botao = findViewById(R.id.btnVoltar);
        txtDesc = findViewById(R.id.descricao);
        it = getIntent();
        descricao = it.getExtras().getString("texto");
        txtDesc.setText(descricao);
        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}