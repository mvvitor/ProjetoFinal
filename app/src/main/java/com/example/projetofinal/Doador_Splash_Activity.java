package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Doador_Splash_Activity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    ImageView imgSetaSplashDoadorFinal, imglogoSplashDoadorFinal, imgLogoDoisSplashFinalDoador;
    TextView txtNome_AppSplashFinalDoador, txtTextoSplashFinal, txtTextoSobreSplashFinalDoador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.doador__splash_layout);

        //apresentando os componetes do xml ao java
        imgSetaSplashDoadorFinal = findViewById(R.id.imgSetaSplashDoadorFinal);
        imglogoSplashDoadorFinal = findViewById(R.id.imglogoSplashDoadorFinal);
        imgLogoDoisSplashFinalDoador = findViewById(R.id.imgLogoDoisSplashFinalDoador);
        txtNome_AppSplashFinalDoador = findViewById(R.id.txtNome_AppSplashFinalDoador);
        txtTextoSplashFinal = findViewById(R.id.txtTextoSplashFinal);
        txtTextoSobreSplashFinalDoador = findViewById(R.id.txtTextoSobreSplashFinalDoador);
    }

    public void JanelaFinalDoador(View view) {
        Intent JanelaFinalDoador = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(JanelaFinalDoador);
    }
}