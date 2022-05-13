package com.example.peliculas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    String tabla = "CREATE TABLE PELICULAS(ID INTEGER PRIMARY KEY, TITULO TEXT, ACTOR TEXT, FECHA TEXT, CIUDAD TEXT)";

    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // se crea la base de datos
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
    }

    // metodo para actualizar las tablas en la base de datos
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table peliculas");
        db.execSQL(tabla);
    }
}
