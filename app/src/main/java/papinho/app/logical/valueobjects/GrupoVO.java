package papinho.app.logical.valueobjects;

import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;

public abstract class GrupoVO {

    String nome;
    JSONArray nomes;
    LocalDateTime data_hora;
    String mensagem;
    JSONObject historico_mensagens;

    public void GrupoVO(JSONArray nomes){
        this.nomes = nomes;
    }

}
