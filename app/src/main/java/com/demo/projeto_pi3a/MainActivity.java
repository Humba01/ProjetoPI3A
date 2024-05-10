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

    // carregadores de tela
    public void loadTelaDeConfiguracoes(View view) {
        setContentView(R.layout.configuracao_usu);
    }
    public void loadTelaDeTemas(View view) {
        setContentView(R.layout.preferencias_temas);
    }
    public void loadTelaDeConversa(View view) {
        setContentView(R.layout.batepapo);
    }
    public void loadTelaDeCadastro(View view) {
        setContentView(R.layout.cadastro_numero);
    }

    // retornos dos carregadores de tela
    public void returnStartScreen(View view) {
        setContentView(R.layout.activity_main);
    }

}
