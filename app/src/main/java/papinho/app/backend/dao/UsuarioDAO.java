package papinho.app.backend.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import org.json.JSONObject;

public class UsuarioDAO extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "PAPINHO_DB";
    private static final String DB_USUARIO = "tb_usuario";
    private static final String KEY_ID = "id";
    private static final String NOME = "nome";
    private static final String TELEFONE = "telefone";
    private static final String PALAVRA_PASSE = "palavra_passe";
    private static final String CONFIGURACOES = "{}";

    public UsuarioDAO(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
