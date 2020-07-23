package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro_Endereco_Activity extends AppCompatActivity {

    //criando variaveis que irão representar os componentes do xml
    TextView txtCadastroEndereco, txtCadastroEnderecoPequeno, txtCepCadastro, txtLogradouroCadastro, txtNumeroCadastro, txtComplementoCadastro, txtBairroCadastroEmpresa, txtCidadeCadastro, txtEstadoCadastro;
    EditText txtCepCampoCadastro, txtLogradouroCampoCadastro, txtNumeroCampoCadastro, txtComplementoCampoCadastro, txtBairroCampoCadastroEmpresa, txtCidadeCadastroCampo, txtEstadoCadastroCampo;
    Button btnVoltarCadastro, btnAvancarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //está chamando o metódo que faz referência ao layout
        setContentView(R.layout.cadastro__endereco_layout);

        //apresentando os componetes do xml ao java
        txtCadastroEndereco = findViewById(R.id.txtCadastroEndereco);
        txtCadastroEnderecoPequeno = findViewById(R.id.txtCadastroEnderecoPequeno);
        txtCepCadastro = findViewById(R.id.txtCepCadastro);
        txtLogradouroCadastro = findViewById(R.id.txtLogradouroCadastro);
        txtNumeroCadastro = findViewById(R.id.txtNumeroCadastro);
        txtComplementoCadastro = findViewById(R.id.txtComplementoCadastro);
        txtBairroCadastroEmpresa = findViewById(R.id.txtBairroCadastroEmpresa);
        txtCidadeCadastro = findViewById(R.id.txtCidadeCadastro);
        txtEstadoCadastro = findViewById(R.id.txtEstadoCadastro);
        txtCepCampoCadastro = findViewById(R.id.txtCepCampoCadastro);
        txtLogradouroCampoCadastro = findViewById(R.id.txtLogradouroCampoCadastro);
        txtNumeroCampoCadastro = findViewById(R.id.txtNumeroCampoCadastro);
        txtComplementoCampoCadastro = findViewById(R.id.txtComplementoCampoCadastro);
        txtBairroCampoCadastroEmpresa = findViewById(R.id.txtBairroCampoCadastroEmpresa);
        txtCidadeCadastroCampo = findViewById(R.id.txtCidadeCadastroCampo);
        txtEstadoCadastroCampo = findViewById(R.id.txtEstadoCadastroCampo);
        btnVoltarCadastro = findViewById(R.id.btnVoltarCadastro);
        btnAvancarCadastro = findViewById(R.id.btnAvancarCadastro);
    }

    //metodo de abrir Janela
    public void voltarJanelaCadastro(View view) {
        Intent voltarJanelaCadastro = new Intent(getApplicationContext(), Cad_Instituicao_Activity.class);
        startActivity(voltarJanelaCadastro);
    }


    public void abrirJanelaPerfil(View view) {
        Intent abrirJanelaPerfil = new Intent(getApplicationContext(), Home_Activity.class);
        startActivity(abrirJanelaPerfil);
    }
}