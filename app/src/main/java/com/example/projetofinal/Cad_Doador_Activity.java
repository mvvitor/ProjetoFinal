package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cad_Doador_Activity extends AppCompatActivity {

    TextView txtNomeCad, txtEmailCad, txtBairroCad, txtCidadeCad, txtEstadoCad, txtAlimentoDoadoCad, txtQuantidadeCad;
    EditText txtNomeCadCampo, txtEmailCadCampo, txtBairroCadCampo, txtCidadeCadCampo, txtEstadoCadCampo, txtAlimentoDoadoCadCampo, txtQuantidadeCadCampo;
    Button btnVoltarCad, btnAvancarCad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.cad__doador_layout);

        //apresentando os componetes do xml ao java
        txtNomeCad = findViewById(R.id.txtNomeCad);
        txtEmailCad = findViewById(R.id.txtEmailCad);
        txtBairroCad = findViewById(R.id.txtBairroCad);
        txtCidadeCad = findViewById(R.id.txtCidadeCad);
        txtEstadoCad = findViewById(R.id.txtEstadoCad);
        txtAlimentoDoadoCad = findViewById(R.id.txtAlimentoDoadoCad);
        txtQuantidadeCad = findViewById(R.id.txtQuantidadeCad);
        txtNomeCadCampo = findViewById(R.id.txtNomeCadCampo);
        txtEmailCadCampo = findViewById(R.id.txtEmailCadCampo);
        txtBairroCadCampo = findViewById(R.id.txtBairroCadCampo);
        txtCidadeCadCampo = findViewById(R.id.txtCidadeCadCampo);
        txtEstadoCadCampo = findViewById(R.id.txtEstadoCadCampo);
        txtAlimentoDoadoCadCampo = findViewById(R.id.txtAlimentoDoadoCadCampo);
        txtQuantidadeCadCampo = findViewById(R.id.txtQuantidadeCadCampo);
        btnVoltarCad = findViewById(R.id.btnVoltarCad);
        btnAvancarCad = findViewById(R.id.btnAvancarCad);
    }

    //metodo de abrir Janela
    public void janelaVoltarMain(View view) {
        Intent janelaVoltarMain = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(janelaVoltarMain);
    }

    public void abrirJanelaSplashDoador(View view) {
        Intent abrirJanelaSplashDoador = new Intent(getApplicationContext(), Doador_Splash_Activity.class);
        startActivity(abrirJanelaSplashDoador);
    }
}