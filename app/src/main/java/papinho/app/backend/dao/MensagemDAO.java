package papinho.app.backend.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import org.json.JSONArray;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import papinho.app.backend.model.MensagemVO;
import papinho.app.backend.model.UsuarioVO;

public class MensagemDAO extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "PAPINHO_DB";
    private static final String TB_MENSAGENS = "tb_mensagens";
    private static final String KEY_ID = "id";
    private static final String USUARIO = "usuario";
    private static final String USUARIO_RECEPTOR = "usuario_receptor";
    private static final String DATA_HORA = "data_hora";
    private static final String MENSAGEM = "mensagem";
    private static final String HISTORICO_MENSAGEM = "historico_mensagem";

    public MensagemDAO(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TB_MENSAGENS = "CREATE TABLE " + TB_MENSAGENS + " ("
                + KEY_ID + " INTEGER PRIMARY KEY, "
                + USUARIO + " TEXT, "
                + USUARIO_RECEPTOR + " TEXT, "
                + DATA_HORA + " DATETIME, "
                + MENSAGEM + " TEXT, "
                + HISTORICO_MENSAGEM + " TEXT )";

        db.execSQL(CREATE_TB_MENSAGENS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_MENSAGENS);
        onCreate(db);
    }

    public void addMensagem(MensagemVO mensagemVO){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(USUARIO, mensagemVO.getUsuario());
        contentValues.put(USUARIO_RECEPTOR, mensagemVO.getUsuario_receptor());
        contentValues.put(DATA_HORA, mensagemVO.getData_hora().toString());
        contentValues.put(MENSAGEM, mensagemVO.getMensagem());
        contentValues.put(HISTORICO_MENSAGEM, mensagemVO.getHistorico_mensagem());

        db.insert(TB_MENSAGENS, null, contentValues);
        db.close();
    }

    public MensagemVO getMensagem(int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TB_MENSAGENS,
                new String[] {KEY_ID, USUARIO},
                KEY_ID + "= ? ",
                new String[] { String.valueOf(id)},
                null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();
        }

        MensagemVO mensagemVO = new MensagemVO();
        mensagemVO.setId(Integer.parseInt(cursor.getString(0)));
        mensagemVO.setUsuario(cursor.getString(1));
        mensagemVO.setUsuario_receptor(cursor.getString(2));
        mensagemVO.setData_hora(cursor.getString(3));
        mensagemVO.setMensagem(cursor.getString(4));
        mensagemVO.setHistorico_mensagem(cursor.getString(5));
        return mensagemVO;
    }

    public List<MensagemVO> getAllMensagens(){
        List<MensagemVO> ltMensagens = new ArrayList<MensagemVO>();
        String selectQuery = "SELECT * FROM " + TB_MENSAGENS;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){
            do {
                MensagemVO mensagemVO = new MensagemVO();
                mensagemVO.setId(Integer.parseInt(cursor.getString(0)));
                mensagemVO.setUsuario(cursor.getString(1));
                mensagemVO.setUsuario_receptor(cursor.getString(2));
                mensagemVO.setData_hora(cursor.getString(3));
                mensagemVO.setMensagem(cursor.getString(4));
                mensagemVO.setHistorico_mensagem(cursor.getString(5));
                ltMensagens.add(mensagemVO);
            } while(cursor.moveToNext());
        }
        return ltMensagens;
    }

    public int updateMensagem(MensagemVO mensagemVO){

        int idQtdRegistrosAlterados = 0;

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(USUARIO, mensagemVO.getUsuario());
        contentValues.put(USUARIO_RECEPTOR, mensagemVO.getUsuario_receptor());
        contentValues.put(MENSAGEM, mensagemVO.getMensagem());
        contentValues.put(HISTORICO_MENSAGEM, mensagemVO.getHistorico_mensagem());

        // update da linha de registro
        idQtdRegistrosAlterados = db.update(TB_MENSAGENS, contentValues,
                KEY_ID + "= ? ",
                new String[] { String.valueOf(mensagemVO.getId()) });
        db.close();

        return idQtdRegistrosAlterados;
    }

    public void deleteMensagem(MensagemVO mensagemVO){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TB_MENSAGENS, KEY_ID + "= ? ",
                new String[] { String.valueOf(mensagemVO.getId())});
        db.close();
    }
}

//    public List<AlunoVO> getAllAlunos() {
//        List<AlunoVO> ltAlunos = new ArrayList<AlunoVO>();
//        String selectQuery = "SELECT * FROM " + TB_ALUNOS;
//
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        if(cursor.moveToFirst()){
//            do {
//                AlunoVO alunoVO = new AlunoVO();
//                alunoVO.setId(Integer.parseInt(cursor.getString(0)));
//                alunoVO.setNome(cursor.getString(1));
//                alunoVO.setMatricula(cursor.getString(2));
//                alunoVO.setEmail(cursor.getString(3));
//                ltAlunos.add(alunoVO);
//            } while(cursor.moveToNext());
//        }
//        return ltAlunos;
//    }
