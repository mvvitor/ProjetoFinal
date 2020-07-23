package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    ImageView imgLogo;
    TextView Nome_app, txtBemVindo, txtSobre, txtLoginJanela;
    Button btnDoar, btnCadastre_se;
    ImageButton btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.activity_main);

        //apresentando os componetes do xml ao java
        imgLogo = findViewById(R.id.imgLogo);
        Nome_app = findViewById(R.id.Nome_App);
        txtBemVindo = findViewById(R.id.txtBemVindo);
        txtSobre = findViewById(R.id.txtSobre);
        txtLoginJanela = findViewById(R.id.txtLoginJanela);
        btnDoar = findViewById(R.id.btnDoar);
        btnCadastre_se = findViewById(R.id.btnCadastre_se);
        btnSobre = findViewById(R.id.btnSobre);
    }

    //metodo de abrir Janela
    public void abrirJanelaLogin(View view) {
        Intent abrirJanelaLogin = new Intent(getApplicationContext(), Login_Activity.class);
        startActivity(abrirJanelaLogin);
    }

    public void abrirJanelaDoarDoador(View view) {
        Intent abrirJanelaDoarDoador = new Intent(getApplicationContext(), Cad_Doador_Activity.class);
        startActivity(abrirJanelaDoarDoador);
    }

    public void abrirJanelaCadastroInstituicao(View view) {
        Intent abrirJanelaCadastroInstituicao = new Intent(getApplicationContext(), Cad_Instituicao_Activity.class);
        startActivity(abrirJanelaCadastroInstituicao);
    }

    public void abrirJanelaSobre(View view) {
        Intent abrirJanelaSobre = new Intent(getApplicationContext(), Splash_Sobre_Activity.class);
        startActivity(abrirJanelaSobre);
    }
}