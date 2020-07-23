package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Sobre_Activity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    ImageView imgSetaSobre, imglogoSobre;
    TextView imgNome_AppSobre, txtSplashFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.splash_sobre_layout);

        //apresentando os componetes do xml ao java
        imgSetaSobre = findViewById(R.id.imgSetaSobre);
        imglogoSobre = findViewById(R.id.imglogoSobre);
        imgNome_AppSobre = findViewById(R.id.imgNome_AppSobre);
        txtSplashFinal = findViewById(R.id.txtSplashFinal);
    }

    public void janelaVoltarSobre(View view) {
        Intent janelaVoltarSobre = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(janelaVoltarSobre);
    }
}