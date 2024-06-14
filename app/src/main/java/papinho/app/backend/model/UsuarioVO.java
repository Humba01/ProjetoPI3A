package papinho.app.backend.model;

import org.json.JSONObject;

public class UsuarioVO {

    int id;

    String nome;

    String telefone;

    String palavraPasse;

    JSONObject configuracoes;

    public UsuarioVO(int id, String nome, String telefone, String palavraPasse, JSONObject configuracoes) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.palavraPasse = palavraPasse;
        this.configuracoes = configuracoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPalavraPasse() {
        return palavraPasse;
    }

    public void setPalavraPasse(String palavraPasse) {
        this.palavraPasse = palavraPasse;
    }

    public JSONObject getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(JSONObject configuracoes) {
        this.configuracoes = configuracoes;
    }
}
