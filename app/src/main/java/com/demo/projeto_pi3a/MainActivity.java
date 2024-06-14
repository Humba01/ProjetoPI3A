package com.demo.projeto_pi3a;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.demo.projeto_pi3a.R;
import papinho.app.backend.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    // interações das telas
    public void btnReturnBackMainActivity(View view) {
        setContentView(R.layout.activity_main);
    }

    // caminhos de ida
    public void btnGotoCadastroActivity(View view){
        setContentView(R.layout.activity_cadastro);
    }

    public void btnGotoLoginActivity(View view){
        setContentView(R.layout.activity_login);
    }

    public void btnGotoConversaActivity(View view){
        setContentView(R.layout.activity_conversa);
    }

    public void btnGotoConversaMaisInfosActivity(View view){
        setContentView(R.layout.activity_conversa_maisinfos);
    }

    public void btnGotoConversaGrupoActivity(View view){
        setContentView(R.layout.activity_conversa_grupo);
    }

    public void btnGotoConversaGrupoMaisInfosActivity(View view){
        setContentView(R.layout.activity_conversa_grupo_maisinfos);
    }

    public void btnGotoConfiguracoesActivity(View view){
        setContentView(R.layout.activity_configuracoes);
    }

}