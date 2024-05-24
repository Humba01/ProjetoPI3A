package papinho.app.logical.valueobjects;

import java.util.ArrayList;

public abstract class TemaVO {

    protected boolean temaClaro = false;
    protected boolean temaEscuro = false;
    protected boolean temaClaroDeuternapia = false;
    protected boolean temaEscuroDeuternapia = false;
    protected boolean temaClaroTritanopia = false;
    protected boolean temaEscuroTritanopia = false;
    
    ArrayList<Boolean> temas;

    public void TemaVO(){
        criaListaTemas();
    };

    public boolean getTemaAtivo(){
        boolean temaAtivo = false;
        int i = 0;
        while(this.temas.get(i) == true) {
            if(this.temas.get(i) != true) {
                temaAtivo = this.temas.get(i);
            }
            i++;
        }
        return temaAtivo;
    };

    public void setTemaAtivo(ETema tema){
        switch (tema) {
            case T1:
                temas.set(0, true);
            case T2:
                temas.set(1, true);
            case T3:
                temas.set(2, true);
            case T4:
                temas.set(3, true);
            case T5:
                temas.set(4, true);
            case T6:
                temas.set(5, true);
        }
    };
    protected void criaListaTemas(){
        this.temas = new ArrayList<Boolean>();
        this.temas.add(temaClaro);
        this.temas.add(temaEscuro);
        this.temas.add(temaClaroDeuternapia);
        this.temas.add(temaEscuroDeuternapia);
        this.temas.add(temaClaroTritanopia);
        this.temas.add(temaEscuroTritanopia);
    };
    
}
