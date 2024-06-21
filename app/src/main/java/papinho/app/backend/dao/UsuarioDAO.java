package papinho.app.backend.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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
                + PALAVRA_PASSE + " TEXT )";

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

        db.insert(TB_USUARIOS, null, contentValues);
        db.close();
    }

    public UsuarioVO getUsuario(String nome, String password){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TB_USUARIOS,
                new String[] {NOME, PALAVRA_PASSE},
                NOME + "= ? ",
                new String[] { String.valueOf(nome), String.valueOf(password)},
                null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();
        }

        UsuarioVO usuarioVO = new UsuarioVO();
        usuarioVO.setId(Integer.parseInt(cursor.getString(0)));
        usuarioVO.setNome(cursor.getString(1));
        usuarioVO.setTelefone(cursor.getString(2));
        usuarioVO.setPalavraPasse(cursor.getString(3));
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
