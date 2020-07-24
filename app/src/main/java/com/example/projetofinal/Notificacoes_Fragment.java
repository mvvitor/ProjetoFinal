package com.example.projetofinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Notificacoes_Fragment extends Fragment {

    ImageView imgUmPonto;
    TextView txtCardUm, txtCardDois, txtCardTres, txtCardQuatro;


    public Notificacoes_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notificacoes, container, false);

        imgUmPonto = view.findViewById(R.id.imgUmPonto);
        txtCardUm = view.findViewById(R.id.txtCardUm);
        txtCardDois = view.findViewById(R.id.txtCardDois);
        txtCardTres = view.findViewById(R.id.txtCardTres);
        txtCardQuatro = view.findViewById(R.id.txtCardQuatro);

        return view;
    }
}