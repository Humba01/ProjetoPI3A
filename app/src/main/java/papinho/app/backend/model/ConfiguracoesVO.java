package papinho.app.backend.model;

import android.annotation.SuppressLint;

import org.json.JSONException;
import org.json.JSONObject;

public class ConfiguracoesVO {

    protected String nome = null;
    protected String telefone = null;
    protected String palavraPasse = null;

    private JSONObject configuracoes = new JSONObject();

    @SuppressLint("NewApi")
    public ConfiguracoesVO(String nome, String telefone, String palavraPasse) throws JSONException {
        this.nome = nome;
        this.telefone = telefone;
        this.palavraPasse = palavraPasse;
        configuracoes.append("nome", this.nome);
        configuracoes.append("telefone", this.telefone);
        configuracoes.append("palavra_passe", this.palavraPasse);
    }

}
