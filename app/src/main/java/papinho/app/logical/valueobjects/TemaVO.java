package papinho.app.logical.valueobjects;

import java.util.ArrayList;

public abstract class TemaVO {

    boolean temaClaro = false;
    boolean temaEscuro = false;
    boolean temaClaroDeuternapia = false;
    boolean temaEscuroDeuternapia = false;
    boolean temaClaroTritanopia = false;
    boolean temaEscuroTritanopia = false;
    
    ArrayList<Boolean> temas = null;

    void TemaVO(String temaAtivo){};

    ArrayList<Boolean> getTemaAtivo(){
        ArrayList<Boolean> x = null; return x;
    };
    void setTemaAtivo(int v){};
    void criaListaTemas(){};
    
}
