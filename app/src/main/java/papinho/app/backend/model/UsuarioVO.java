package papinho.app.backend.model;

import org.json.JSONObject;

public class UsuarioVO {

    protected int id;

    protected String nome;

    protected String telefone;

    protected String email;

    protected String palavraPasse;

    protected String configuracoes;

    public UsuarioVO(){}

    public UsuarioVO(int id, String nome, String telefone, String email, String palavraPasse, String configuracoes) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.palavraPasse = palavraPasse;
        this.configuracoes = configuracoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

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

    public String getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(String configuracoes) {
        this.configuracoes = configuracoes;
    }
}
