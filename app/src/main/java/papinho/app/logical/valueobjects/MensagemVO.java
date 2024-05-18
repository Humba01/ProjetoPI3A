package papinho.app.logical.valueobjects;

import java.util.LinkedList;

public abstract class MensagemVO {

    String nome = null;
    String nome_receptor = null;
    String data_hora = null;
    String mensagem = null;
    LinkedList<String> historico_mensagem = null;

    void MensagemVO(String nome, String nome_receptor, String data_hora, String mensagem){
        this.nome = nome;
        this.nome_receptor = nome_receptor;
        this.data_hora = data_hora;
        this.mensagem = mensagem;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_receptor() {
        return nome_receptor;
    }

    public void setNome_receptor(String nome_receptor) {
        this.nome_receptor = nome_receptor;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LinkedList<String> getHistorico_mensagem() {
        return historico_mensagem;
    }

    public void setHistorico_mensagem(LinkedList<String> historico_mensagem) {
        this.historico_mensagem = historico_mensagem;
    }
}
