package papinho.app.backend.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import org.json.JSONArray;

import java.time.LocalDateTime;

public class MensagemDAO extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "PAPINHO_DB";
    private static final String TB_MENSAGEM = "tb_mensagem";
    private static final String KEY_ID = "id";
    private static final String NOME = "nome";
    private static final String NOME_RECEPTOR = "nome_receptor";
    private static final String DATA_HORA = "data_hora";
    private static final String MENSAGEM = "mensagem";
    private static final String HISTORICO_MENSAGEM = "historico_mensagem";

    public MensagemDAO(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
