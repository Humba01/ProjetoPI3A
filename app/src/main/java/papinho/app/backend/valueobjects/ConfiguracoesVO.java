package papinho.app.backend.valueobjects;

public abstract class ConfiguracoesVO {

    String nome = null;
    String email = null;
    ETema temaAtivo = null;
    int tamanhoTexto = 1;


    public ConfiguracoesVO(String nome, String email, ETema temaAtivo, int tamanhoTexto) {
        this.nome = nome;
        this.email = email;
        this.temaAtivo = temaAtivo;
        this.tamanhoTexto = tamanhoTexto;
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

    public ETema getTemaAtivo() {
        return temaAtivo;
    }

    public void setTemaAtivo(ETema temaAtivo) {
        this.temaAtivo = temaAtivo;
    }

    public int getTamanhoTexto() {
        return tamanhoTexto;
    }

    public void setTamanhoTexto(int tamanhoTexto) {
        this.tamanhoTexto = tamanhoTexto;
    }
}
