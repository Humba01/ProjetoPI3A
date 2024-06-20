package papinho.app.backend.model;

import org.json.JSONArray;

import java.time.LocalDateTime;

public class MensagemVO {

    protected int id;

    protected String usuario;

    protected String usuario_receptor;

    protected String data_hora;

    protected String mensagem;

    protected String historico_mensagem;

    public MensagemVO(){}

        public MensagemVO(int id, String usuario, String usuario_receptor, String data_hora, String mensagem, String historico_mensagem) {
        this.id = id;
        this.usuario = usuario;
        this.usuario_receptor = usuario_receptor;
        this.data_hora = data_hora;
        this.mensagem = mensagem;
        this.historico_mensagem = historico_mensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario_receptor() {
        return usuario_receptor;
    }

    public void setUsuario_receptor(String usuario_receptor) {
        this.usuario_receptor = usuario_receptor;
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

    public String getHistorico_mensagem() {
        return historico_mensagem;
    }

    public void setHistorico_mensagem(String historico_mensagem) {
        this.historico_mensagem = historico_mensagem;
    }
}
