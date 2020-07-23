package com.example.projetofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Activity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        bottomNavigationView = findViewById(R.id.idBottomNavBar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //instanciando a classe Fragment
                Fragment fragment = null;

                switch (menuItem.getItemId()) {
                    case R.id.mNotificacoes:
                        fragment = new Notificacoes_Fragment();
                        break;
                    case R.id.mDoacoes:
                        fragment = new Doacoes_Fragment();
                        break;
                    case R.id.mPerfil:
                        fragment = new Perfil_Fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.idframeLayout, fragment).commit();

                return true;
            }
        });
    }
}