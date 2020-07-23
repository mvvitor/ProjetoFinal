package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cad_Instituicao_Activity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    TextView txtEmailCadInstituicao, txtSenhaCadInstituicao, txtConfirmarSenhaCadInstituicao, txtCnpjCadInstituicao, txtNomeDaEmpresaCadInstituicao, txtTelefoneCadInstituicao;
    EditText txtNomeCadCampoInstituicao, txtSenhaCadCampoInstituicao, txtConfirmarSenhaCadCampoInstituicao, txtCnpjCadCampoInstituicao, txtNomeDaEmpresaCadCampoInstituicao, txtTelefoneCadCampoInstituicao;
    Button btnVoltarCad, btnAvancarCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.cad__instituicao_layout);

        //apresentando os componetes do xml ao java
        txtEmailCadInstituicao = findViewById(R.id.txtEmailCadInstituicao);
        txtSenhaCadInstituicao = findViewById(R.id.txtSenhaCadInstituicao);
        txtConfirmarSenhaCadInstituicao = findViewById(R.id.txtConfirmarSenhaCadInstituicao);
        txtCnpjCadInstituicao = findViewById(R.id.txtCnpjCadInstituicao);
        txtNomeDaEmpresaCadInstituicao = findViewById(R.id.txtNomeDaEmpresaCadInstituicao);
        txtTelefoneCadInstituicao = findViewById(R.id.txtTelefoneCadInstituicao);
        txtNomeCadCampoInstituicao = findViewById(R.id.txtNomeCadCampoInstituicao);
        txtSenhaCadCampoInstituicao = findViewById(R.id.txtSenhaCadCampoInstituicao);
        txtConfirmarSenhaCadCampoInstituicao = findViewById(R.id.txtConfirmarSenhaCadCampoInstituicao);
        txtCnpjCadCampoInstituicao = findViewById(R.id.txtCnpjCadCampoInstituicao);
        txtNomeDaEmpresaCadCampoInstituicao = findViewById(R.id.txtNomeDaEmpresaCadCampoInstituicao);
        txtTelefoneCadCampoInstituicao = findViewById(R.id.txtTelefoneCadCampoInstituicao);
        btnVoltarCad = findViewById(R.id.btnVoltarCad);
        btnAvancarCad = findViewById(R.id.btnAvancarCad);

    }

    public void abrirJanelaCad(View view) {
        Intent abrirJanelaCad = new Intent(getApplicationContext(), Cadastro_Endereco_Activity.class);
        startActivity(abrirJanelaCad);
    }

    public void janelaVoltar(View view) {
        Intent janelaVoltar = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(janelaVoltar);
    }
}