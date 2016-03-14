package com.example.darshanapriyasad.driverapp.dbaccess;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.darshanapriyasad.driverapp.dbhandler.DBHandle;
import com.example.darshanapriyasad.driverapp.dbhandler.DBSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class DriverDBAccess {

    private DBSupport dbSupport;
    private SQLiteDatabase writableDatabase;
    private SQLiteDatabase readableDatabase;
    private DBHandle dbHandle;

    public DriverDBAccess(){

        dbHandle = new DBHandle();
        dbSupport = new DBSupport();
        writableDatabase = dbSupport.getWritableDatabaseConnection();
        readableDatabase = dbSupport.getReadableDatabaseConnection();
    }



    public String isValidDriver(String user_name,String password) {

        String sql = "SELECT driver_id FROM Driver_Detail where user_name=? and password =?;";


        String[] values = {user_name,password};
        Cursor data=dbHandle.getData(readableDatabase,sql,values);

        if(data.moveToFirst()){
            String driver_id = data.getString(0);
            return driver_id;

        }else{
            return null;
        }

    }

    public boolean isRegistered(){
        String sql = "SELECT * FROM Driver_Detail;";



        Cursor data=dbHandle.getData(readableDatabase,sql);

        if(data.moveToFirst()){
            return true;

        }else{
            return false;
        }
    }

    public boolean addDriver(String driver_id, String user_name, String password) {
        String sql = "insert into Driver_Detail values(?,?,?)";
        String values[] = {driver_id,user_name,password};
        boolean added = dbHandle.setData(writableDatabase, sql, values, 1);
        return added;

    }
}
