package papinho.app.logical.valueobjects;

import org.json.JSONObject;

public abstract class UsuarioVO {

    String nome = null;
    String email = null;
    String palavra_passe = null;
    JSONObject configuracoes = null;

    void UserVO(String nome, String email, String palavra_passe, JSONObject configuracoes){
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.configuracoes = configuracoes;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPalavra_passe() {
        return palavra_passe;
    }

    public void setPalavra_passe(String palavra_passe) {
        this.palavra_passe = palavra_passe;
    }

    public JSONObject getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(JSONObject configuracoes) {
        this.configuracoes = configuracoes;
    }
}
