package papinho.app.userinterface;

import android.widget.CheckBox;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projeto_pi3a.R;

public abstract class InterfaceCheckboxs extends AppCompatActivity {

    // Controle de temas da interface de usuário
    protected CheckBox light_checkbox = (CheckBox) findViewById(R.id.checkBox);
    protected CheckBox dark_checkbox = (CheckBox) findViewById(R.id.checkBox2);
    protected CheckBox light_protanopia_and_deuteranopia_checkbox = (CheckBox) findViewById(R.id.checkBox3); // red and green color blindness.
    protected CheckBox dark_protanopia_and_deuteranopia_checkbox = (CheckBox) findViewById(R.id.checkBox4); // red and green color blindness.
    protected CheckBox light_tritanopia_checkbox = (CheckBox) findViewById(R.id.checkBox5); // yellow and blue color blindness.
    protected CheckBox dark_tritanopia_checkbox = (CheckBox) findViewById(R.id.checkBox6); // yellow and blue color blindness.

    // Troca de temas da UI
    public void trocandoTema(){}

}
