package com.e.wordle;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper (Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    public static final String DATABASE_NAME = "wordle.db";
    public static final String TABLE_NAME = "wordle";
    public static final String COL2 = "TRUTH";
    public static final String COL3 = "FALSER";
    public static final String COL4 = "ONE_TRY";
    public static final String COL5 = "TWO_TRY";
    public static final String COL6 = "THREE_TRY";
    public static final String COL7 = "FOUR_TRY";
    public static final String COL8 = "FIVE_TRY";
    public static final String COL9 = "SIX_TRY";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable = "CREATE TABLE "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+"TRUTH INTEGER," +
                " FALSER INTEGER, ONE_TRY INTEGER, TWO_TRY INTEGER, THREE_TRY INTEGER, FOUR_TRY INTEGER, FIVE_TRY INTEGER, SIX_TRY INTEGER)";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }

    public boolean insert(int trials, boolean truth)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        int item2 = 0;
        int item3 = 0;
        int item4 = 0;
        int item5 = 0;
        int item6 = 0;
        int item7 = 0;
        int item8 = 0;
        int item9 = 0;

        if(truth)
        {
            item2 = 1;
        }
        else
        {
            item3 = 1;
        }

        if(trials==1)
        {
            item4 = 1;
        }
        else if(trials == 2)
        {
            item5 = 1;
        }
        else if(trials == 3)
        {
            item6 = 1;
        }
        else if(trials == 4)
        {
            item7 = 1;
        }
        else if(trials == 5)
        {
            item8 = 1;
        }
        else if(trials == 6)
        {
            item9 = 1;
        }


        contentValues.put(COL2, item2);
        contentValues.put(COL3, item3);
        contentValues.put(COL4, item4);
        contentValues.put(COL5, item5);
        contentValues.put(COL6, item6);
        contentValues.put(COL7, item7);
        contentValues.put(COL8, item8);
        contentValues.put(COL9, item9);

        long result = db.insert(TABLE_NAME, null, contentValues);

        if(result==-1)
            return false;
        return true;
    }

    public Cursor checkName(String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM "+TABLE_NAME+" WHERE "+name +" =1";
        Cursor data = db.rawQuery(query,null);
        return data;
    }
}
