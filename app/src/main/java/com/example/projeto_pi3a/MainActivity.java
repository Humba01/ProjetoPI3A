package com.example.projeto_pi3a;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

    // Controle de temas da interface de usuário
    protected interface ThemeControl {
        boolean light = false;
        boolean dark = false;
        // temas experimentais
        boolean light_protanopia_and_deuteranopia = false; // red and green color blindness.
        boolean dark_protanopia_and_deuteranopia = false; // red and green color blindness.
        boolean light_tritanopia = false; // yellow and blue color blindness.
        boolean dark_tritanopia = false; // yellow and blue color blindness.
    }

    protected CheckBox light_checkbox = (CheckBox) findViewById(R.id.checkBox);
    protected CheckBox dark_checkbox = (CheckBox) findViewById(R.id.checkBox2);
    protected CheckBox light_protanopia_and_deuteranopia_checkbox = (CheckBox) findViewById(R.id.checkBox3);
    protected CheckBox dark_protanopia_and_deuteranopia_checkbox = (CheckBox) findViewById(R.id.checkBox4);
    protected CheckBox light_tritanopia_checkbox = (CheckBox) findViewById(R.id.checkBox5);
    protected CheckBox dark_tritanopia_checkbox = (CheckBox) findViewById(R.id.checkBox6);

}
