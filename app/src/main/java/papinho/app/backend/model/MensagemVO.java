package papinho.app.backend.model;

import org.json.JSONArray;

import java.time.LocalDateTime;

public class MensagemVO {

    String nome;

    String nome_receptor;

    LocalDateTime data_hora;

    String mensagem;

    JSONArray historico_mensagem;

    public MensagemVO(String nome, String nome_receptor, LocalDateTime data_hora, String mensagem, JSONArray historico_mensagem) {
        this.nome = nome;
        this.nome_receptor = nome_receptor;
        this.data_hora = data_hora;
        this.mensagem = mensagem;
        this.historico_mensagem = historico_mensagem;
    }

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

    public JSONArray getHistorico_mensagem() {
        return historico_mensagem;
    }

    public void setHistorico_mensagem(JSONArray historico_mensagem) {
        this.historico_mensagem = historico_mensagem;
    }
}
