package com.demo.projeto_pi3a;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import papinho.app.backend.model.*;
import papinho.app.backend.dao.*;

public class MainActivity extends AppCompatActivity {

    protected static boolean usuarioLogado = false;
    protected static boolean usuarioInativado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        if(usuarioLogado == false) {
            setContentView(R.layout.activity_cadastro);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_cadastro), (v, insets) -> {
              Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
              v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
              return insets;
            });
        } else {
            setContentView(R.layout.activity_main);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }
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

    // telas de cadastro e login - formulário
    public void btnCadastraUsuario(View view){
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        UsuarioVO usuarioVO = new UsuarioVO();

        // campo de cadastro
        EditText defNome = (EditText) findViewById(R.id.defNome);
        usuarioVO.setNome(defNome.getText().toString());

        EditText defTelefone = (EditText) findViewById(R.id.defTelefone);
        usuarioVO.setTelefone(defTelefone.getText().toString());

        EditText defEmail = (EditText) findViewById(R.id.defEmail);
        usuarioVO.setEmail(defEmail.getText().toString());

        EditText defPassword = (EditText) findViewById(R.id.defPassword);
        usuarioVO.setPalavraPasse(defPassword.getText().toString());
        usuarioDAO.addUsuario(usuarioVO);

        usuarioLogado = true;
        this.btnReturnBackMainActivity(view);

        // -----------------------------------------------------------
        Log.d("Insert: ", "Registros no banco de dados com sucesso.");
    }

    public void btnLoginUsuario(View view){
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        UsuarioVO usuarioVO = new UsuarioVO();

        // campo de login
        EditText enterNome = (EditText) findViewById(R.id.enterName);
        usuarioVO.setNome(enterNome.getText().toString());

        EditText enterPassword = (EditText) findViewById(R.id.enterPassword);
        usuarioVO.setPalavraPasse(enterPassword.getText().toString());
        UsuarioVO verificaUsuario = usuarioDAO.getUsuario(usuarioVO.getNome(), usuarioVO.getPalavraPasse());

        if(verificaUsuario.getNome() == usuarioVO.getNome() && verificaUsuario.getPalavraPasse() == usuarioVO.getPalavraPasse()) {
            this.btnReturnBackMainActivity(view);
            usuarioLogado = true;
        } else {
            Log.w("Warn Form: ", "Dados Incorretos");
        }

        // -----------------------------------------------------------
        Log.d("Get: ", "Leitura do banco de dados com sucesso.");
    }

    public void btnUpdateUsuario(View view){
//        // update
//        EditText campoAluno = (EditText) findViewById(R.id.updateDadoNome);
//        alunoVO.setNome(campoAluno.getText().toString());
//
//        EditText campoMatricula = (EditText) findViewById(R.id.updateDadoMatricula);
//        alunoVO.setMatricula(campoMatricula.getText().toString());
//
//        EditText campoEmail = (EditText) findViewById(R.id.updateDadoEmail);
//        alunoVO.setEmail(campoEmail.getText().toString());
//        alunoDAO.updateAluno(alunoVO);
//
//        // -----------------------------------------------------------
//        Log.d("Update: ", "Atualização dos registros no banco de dados com sucesso.");
    }

    public void btnDeleteUsuario(View view){
//        AlunoDAO alunoDAO = new AlunoDAO(this);
//        AlunoVO alunoVO = new AlunoVO();
//
//        // delete
//        EditText campoAluno = (EditText) findViewById(R.id.deleteDadoId);
//        alunoVO.setId(Integer.parseInt(campoAluno.getText().toString()));
//        alunoDAO.deleteAluno(alunoVO);
//
//        // -----------------------------------------------------------
//        Log.d("Delete: ", "Remoção do banco de dados feita com sucesso.");
        usuarioLogado = false;
    }

    // funcionalidade em análise para implementação
    public void btnStandByUsuario(View view){
        usuarioInativado = true;
        usuarioLogado = false;
        setContentView(R.layout.activity_cadastro);
    }

}
