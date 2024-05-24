package papinho.app.logical.valueobjects;

import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class MensagemVO {

    String nome = null;
    String nome_receptor = null;
    LocalDateTime data_hora = null;
    String mensagem = null;
    LinkedList<JSONObject> historico_mensagens = null;

    void MensagemVO(String nome, String nome_receptor, LocalDateTime data_hora, String mensagem){
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

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LinkedList<JSONObject> getHistorico_mensagem() {
        return historico_mensagens;
    }

    public void setHistorico_mensagem(LinkedList<JSONObject> historico_mensagem) {
        this.historico_mensagens = historico_mensagem;
    }
}
