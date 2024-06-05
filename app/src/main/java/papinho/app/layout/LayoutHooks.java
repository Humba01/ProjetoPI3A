package papinho.app.layout;

import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projeto_pi3a.R;

import java.util.ArrayList;

public class LayoutHooks extends AppCompatActivity {

    // botão de configurações do menu principal
    protected ImageView config_btn_main = (ImageView) findViewById(R.id.mais_opcoes_conversa);

    // lista de cards de acesso as conversas
    protected ArrayList<android.widget.LinearLayout> cards_opts_main=
            new ArrayList<android.widget.LinearLayout>(3);

    // botão de adicionar nova conversa
    protected ImageView nova_conversa_btn = (ImageView) findViewById(R.id.botao_adicionar_nova_conversa);

    // botão de configurações do chat de conversa
    protected ImageView config_btn_chat = (ImageView) findViewById(R.id.mais_opcoes_conversa_chat);

    public LayoutHooks() {
        this.cards_opts_main.set(0, (LinearLayout) findViewById(R.id.card_conversa1));
        this.cards_opts_main.set(1, (LinearLayout) findViewById(R.id.card_conversa2));
        this.cards_opts_main.set(2, (LinearLayout) findViewById(R.id.card_conversa3));
    }
}
