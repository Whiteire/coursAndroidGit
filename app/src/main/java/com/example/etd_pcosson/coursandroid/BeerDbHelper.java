package com.example.etd_pcosson.coursandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by ETD-P\cosson on 07/11/16.
 */
public class BeerDbHelper extends SQLiteOpenHelper{

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + BeerEntry.TABLE_NAME + " (" +
                    BeerEntry._ID + " INTEGER PRIMARY KEY," +
                    BeerEntry.BEER_NAME + TEXT_TYPE + COMMA_SEP +
                    BeerEntry.BEER_DESC + TEXT_TYPE + " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + BeerEntry.TABLE_NAME;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Beer.db";


    public BeerDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public static class BeerEntry implements BaseColumns {
        public static final String TABLE_NAME = "Beer";
        public static final String BEER_NAME = "Chouffe";
        public static final String  BEER_DESC= "c'est bon";
    }
}
