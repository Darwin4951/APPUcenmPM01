package com.ucenm.appucenmpm01.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

// Esta clase administra la creación y los cambios de versión de la base de datos SQLite.
public class DatabaseHelper extends SQLiteOpenHelper
{

    // Recibe la configuración de la base de datos; está aquí porque esta clase administra su apertura.
    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // Usa la configuración de DBConfig; está aquí para abrir siempre la base de datos de la aplicación.
    public DatabaseHelper(@Nullable Context context)
    {
        super(context, DBConfig.DATABASE_NAME, null, DBConfig.DATABASE_VERSION);
    }

    @Override
    // Crea la tabla la primera vez; está aquí porque SQLiteOpenHelper delega la creación en esta clase.
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConfig.CREATE_TABLE_PERSONAS);
    }

    @Override
    // Borra y vuelve a crear la tabla al subir la versión, perdiendo sus datos; está aquí porque gestiona esos cambios.
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DBConfig.DROP_TABLE_PERSONAS);
        onCreate(db);
    }
}
