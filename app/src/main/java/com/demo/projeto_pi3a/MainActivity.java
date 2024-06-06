package com.demo.projeto_pi3a;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.projeto_pi3a.R;
import papinho.app.logical.*;

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

    // telas disponiveis e seus respectivos elementos (ainda não adicionados)
    public void btnGotoCadastroActivity(View view){
        setContentView(R.layout.activity_cadastro);
    }

    public void btnGotoLoginActivity(View view){
        setContentView(R.layout.activity_login);
    }

    public void btnGotoMainActivity(View view){
        setContentView(R.layout.activity_main);
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

    public void btnGotoConfiguracoesDadosPessoaisActivity(View view){
        setContentView(R.layout.activity_configuracoes_dados_pessoais);
    }

    public void btnGotoConfiguracoesSobreOPapinhoActivity(View view){
        setContentView(R.layout.activity_configuracoes_sobre_o_papinho);
    }

    public void btnGotoConfiguracoesTemasEAcessibilidadeActivity(View view){
        setContentView(R.layout.activity_configuracoes_t_e_a);
    }

}
