package papinho.app.logical.valueobjects;

import org.json.JSONArray;

public abstract class GrupoVO {

    JSONArray nomes;

    public void GrupoVO(JSONArray nomes){
        this.nomes = nomes;
    }

}
