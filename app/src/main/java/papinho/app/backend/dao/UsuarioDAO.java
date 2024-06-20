package papinho.app.backend.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import papinho.app.backend.model.UsuarioVO;

public class UsuarioDAO extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "PAPINHO_DB";
    private static final String TB_USUARIOS = "tb_usuarios";
    private static final String KEY_ID = "id";
    private static final String NOME = "nome";
    private static final String EMAIL = "email";
    private static final String TELEFONE = "telefone";
    private static final String PALAVRA_PASSE = "palavra_passe";
    private static final String CONFIGURACOES = "configuracoes";

    public UsuarioDAO(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TB_USUARIOS = "CREATE TABLE " + TB_USUARIOS + " ("
                + KEY_ID + " INTEGER PRIMARY KEY, "
                + NOME + " TEXT, "
                + EMAIL + " TEXT, "
                + TELEFONE + " TEXT, "
                + PALAVRA_PASSE + " TEXT, "
                + CONFIGURACOES + " TEXT )";

        db.execSQL(CREATE_TB_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_USUARIOS);
        onCreate(db);
    }

    public void addUsuario(UsuarioVO usuarioVO){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(NOME, usuarioVO.getNome());
        contentValues.put(EMAIL, usuarioVO.getEmail());
        contentValues.put(TELEFONE, usuarioVO.getTelefone());
        contentValues.put(PALAVRA_PASSE, usuarioVO.getPalavraPasse());
        contentValues.put(CONFIGURACOES, usuarioVO.getConfiguracoes());

        db.insert(TB_USUARIOS, null, contentValues);
        db.close();
    }

    public UsuarioVO getUsuario(int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TB_USUARIOS,
                new String[] {KEY_ID, NOME},
                KEY_ID + "= ? ",
                new String[] { String.valueOf(id)},
                null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();
        }

        UsuarioVO usuarioVO = new UsuarioVO();
        usuarioVO.setId(Integer.parseInt(cursor.getString(0)));
        usuarioVO.setNome(cursor.getString(1));
        usuarioVO.setEmail(cursor.getString(2));
        usuarioVO.setTelefone(cursor.getString(3));
        usuarioVO.setPalavraPasse(cursor.getString(4));
        usuarioVO.setConfiguracoes(cursor.getString(5));
        return usuarioVO;
    }

    public int updateUsuario(UsuarioVO usuarioVO){

        int idQtdRegistrosAlterados = 0;

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EMAIL, usuarioVO.getEmail());
        contentValues.put(TELEFONE, usuarioVO.getTelefone());
        contentValues.put(PALAVRA_PASSE, usuarioVO.getPalavraPasse());

        // update da linha de registro
        idQtdRegistrosAlterados = db.update(TB_USUARIOS, contentValues,
                KEY_ID + "= ? ",
                new String[] { String.valueOf(usuarioVO.getId()) });
        db.close();

        return idQtdRegistrosAlterados;
    }

    public void deleteUsuario(UsuarioVO usuarioVO){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TB_USUARIOS, KEY_ID + "= ? ",
                new String[] { String.valueOf(usuarioVO.getId())});
        db.close();
    }
}
