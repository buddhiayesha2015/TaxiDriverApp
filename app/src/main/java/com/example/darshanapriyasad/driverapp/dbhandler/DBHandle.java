package com.example.darshanapriyasad.driverapp.dbhandler;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class DBHandle {
    public Cursor getData(SQLiteDatabase database,String sql,String[] data){
        Cursor cursor = database.rawQuery(sql, data);
        return cursor;
    }

    public Cursor getData(SQLiteDatabase database,String sql){
        Cursor cursor = database.rawQuery(sql, null);
        return cursor;
    }

    public boolean setData(SQLiteDatabase database,String sql,int type){
        SQLiteStatement statement = database.compileStatement(sql);
        if(type == 1){
            long rowCount = statement.executeInsert();
            return rowCount>0;
        }else{
            statement.execute();
            return true;
        }
    }

    public boolean setData(SQLiteDatabase database,String sql,String[] data,int type){
        SQLiteStatement statement = database.compileStatement(sql);
        statement.bindAllArgsAsStrings(data);
        if(type == 1){
            long rowCount = statement.executeInsert();
            return rowCount>0;
        }else{
            statement.execute();
            return true;
        }
    }
}
