package com.example.projetofinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Perfil_Fragment extends Fragment {
    ImageView imgTresPontosFragment, imgPerfilFragment;
    TextView txtDescricaoPerfilFragment, txtNumeroFragment, txtNomeDescricaoFragment, txtTextoDescricaoFragment;


    public Perfil_Fragment() {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);


        imgTresPontosFragment = view.findViewById(R.id.imgTresPontosFragment);
        imgPerfilFragment = view.findViewById(R.id.imgPerfilFragment);
        txtDescricaoPerfilFragment = view.findViewById(R.id.txtDescricaoPerfilFragment);
        txtNumeroFragment = view.findViewById(R.id.txtNumeroFragment);
        txtNomeDescricaoFragment = view.findViewById(R.id.txtNomeDescricaoFragment);
        txtTextoDescricaoFragment = view.findViewById(R.id.txtTextoDescricaoFragment);

        return view;


    }
}