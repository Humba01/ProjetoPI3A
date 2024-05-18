package papinho.app.logical.valueobjects;

public abstract class ConfiguracoesVO {

    String nome = null;
    String email = null;

    public void ConfiguracoesVO(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

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
}
