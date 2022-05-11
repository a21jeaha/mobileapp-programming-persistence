package com.example.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class AssignmentDB extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "person.db";                        // måste vara static för att fungera
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_PEOPLE = "people";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAMN = "namn";
    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_HIGHT = "hight";

    public AssignmentDB(@Nullable Context context) {                // attributen name, factory och version, togs bort
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {                           //// refraktor och sedan introduce constant användes för att associera namnen på kolumnerna med en konstant.
        db.execSQL("CREATE TABLE " + TABLE_PEOPLE + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY, " +
                    COLUMN_NAMN + " TEXT, " +
                    COLUMN_AGE + " INTEGER, " +
                    COLUMN_HIGHT + " INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
