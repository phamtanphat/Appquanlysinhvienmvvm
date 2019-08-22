package com.example.designpatternmvvm.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SinhvienDatabase extends SQLiteOpenHelper {
    private static final String TAG = "SinhvienDBHelper";
    private static final String DATABASE_NAME = "sinhvien.sql";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_SINHVIEN = "Sinhvien";

    public SinhvienDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCreateTable = "CREATE TABLE "+ TABLE_SINHVIEN +"(Id INTEGER PRIMARY KEY AUTOINCREMENT , Ten VARCHAR ,Diachi VARCHAR ,Hinhanh BLOB)";
        db.execSQL(queryCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SINHVIEN);
        onCreate(db);
    }
    public void getData(){

    }

}
