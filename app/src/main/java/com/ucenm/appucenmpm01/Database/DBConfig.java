package com.ucenm.appucenmpm01.Database;

// Esta clase reúne los nombres y las consultas SQL para compartir la configuración de la base de datos.
public class DBConfig
{
    public static final String DATABASE_NAME = "dbpersonas.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_PERSONAS = "personas";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "nombres";
    public static final String COLUMN_APELLIDOS = "apellidos";
    public static final String COLUMN_FECHANAC = "fechanac";
    public static final String COLUMN_DIRECCION = "direccion";
    public static final String COLUMN_TELEFONO = "telefono";
    public static final String COLUMN_CORREO = "correo";

    // Define cómo crear la tabla; se guarda aquí para centralizar su estructura.
    public static final String CREATE_TABLE_PERSONAS =
            "CREATE TABLE " + TABLE_PERSONAS + " ( " +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT NOT NULL, " +
                    COLUMN_APELLIDOS + " TEXT NOT NULL, " +
                    COLUMN_FECHANAC + " TEXT NOT NULL, " +
                    COLUMN_DIRECCION + " TEXT NOT NULL, " +
                    COLUMN_TELEFONO + " TEXT NOT NULL, " +
                    COLUMN_CORREO + " TEXT NOT NULL ) ";

    // Define cómo borrar la tabla; se guarda aquí junto con las demás instrucciones SQL.
    public static final String DROP_TABLE_PERSONAS =
            "DROP TABLE IF EXISTS " + TABLE_PERSONAS;

    // Consulta todas las personas; se guarda aquí para reutilizar la misma instrucción SQL.
    public static final String SELECT_PERSONAS =
            "SELECT * FROM " + TABLE_PERSONAS;
}
