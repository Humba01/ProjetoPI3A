package papinho.app.backend.model;

import org.json.JSONObject;

interface JSONConfigModel {
    String nome = null;
    String telefone = null;
    String palavraPasse = null;
    JSONObject temas = new JSONObject();
}

public class ConfiguracoesVO {

    JSONConfigModel configuracoes;

}
