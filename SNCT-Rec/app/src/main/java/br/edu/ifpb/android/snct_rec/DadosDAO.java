package br.edu.ifpb.android.snct_rec;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DadosDAO extends SQLiteOpenHelper {
    private static final String BD = "SNCT";
    private static final int VERSAO = 3;
    public DadosDAO(Context context) {

        super(context, BD, null, VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void InserirDadosBD(String nome, String titulo, String nota, String comentarios) {
        SQLiteDatabase db = getReadableDatabase();
        try {

        ContentValues initialValues = new ContentValues();
            initialValues.put("NOME_AVALIADOR", nome);
            initialValues.put("TITULO_TRABALHO", titulo);
            initialValues.put("NOTA", nota);
            initialValues.put("COMENTARIO", comentarios);
            getWritableDatabase().insert("TB_AVALIACAO", null, initialValues);
        } finally {
            db.close();
        }
    }
}