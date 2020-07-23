package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    ImageView imgSetaLogin, imglogoLogin;
    TextView txtNome_AppLogin, txtEmailLogin, txtSenhaLogin;
    EditText txtEmailLoginCampo, txtSenhaLoginCampo;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.login_layout);

        //apresentando os componetes do xml ao java
        imgSetaLogin = findViewById(R.id.imgSetaLogin);
        imglogoLogin = findViewById(R.id.imglogoLogin);
        txtNome_AppLogin = findViewById(R.id.txtNome_AppLogin);
        txtEmailLogin = findViewById(R.id.txtEmailLogin);
        txtSenhaLogin = findViewById(R.id.txtSenhaLogin);
        txtEmailLoginCampo = findViewById(R.id.txtEmailLoginCampo);
        txtSenhaLoginCampo = findViewById(R.id.txtSenhaLoginCampo);
        btnEntrar = findViewById(R.id.btnEntrar);
    }

    //metodo de abrir Janela
    public void janelaVoltar(View view) {
        Intent janelaVoltar = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(janelaVoltar);

    }

    public void abrirJanelaPerfil(View view) {
        Intent abrirJanelaPerfil = new Intent(getApplicationContext(), Home_Activity.class);
        startActivity(abrirJanelaPerfil);}

    public void voltarJanelaLogin(View view) {
        Intent voltarJanelaLogin = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarJanelaLogin);
    }
}