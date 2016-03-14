package com.example.darshanapriyasad.driverapp.dbaccess;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.darshanapriyasad.driverapp.dbhandler.DBHandle;
import com.example.darshanapriyasad.driverapp.dbhandler.DBSupport;
import com.example.darshanapriyasad.driverapp.model.SMS;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class SMSDBAccess {

    private DBSupport dbSupport;
    private SQLiteDatabase writableDatabase;
    private SQLiteDatabase readableDatabase;
    private DBHandle dbHandle;

    public SMSDBAccess(){
        dbHandle = new DBHandle();
        dbSupport = new DBSupport();
        writableDatabase = dbSupport.getWritableDatabaseConnection();
        readableDatabase = dbSupport.getReadableDatabaseConnection();
    }

    public String[] readSMS() {

        String sql = "SELECT * FROM Messages where got_hire = false limit 1;";

        Cursor data=dbHandle.getData(readableDatabase,sql);

        if(data.moveToFirst()){
            String customer_name = data.getString(1);
            String fromLocation = data.getString(2);
            String toLocatio = data.getString(3);
            String fromDate = data.getString(4);
            String time = data.getString(5);
            String dayCount = data.getString(6);
            String charge = data.getString(7);
            String vehicleType = data.getString(8);
            String passengerCount = data.getString(9);

            String[] gotData = {customer_name,fromLocation,toLocatio,fromDate,time,dayCount,charge,vehicleType,passengerCount};
            return gotData;
        }else{
            return null;
        }

    }

    public boolean insertSMS(SMS data){

        String sql = "insert into Messages values(?,?,?,?,?,?,?,?,?,?)";
        String values[] = {data.getCustomer_name(),data.getFrom_location(),data.getTo_location(),data.getDate().toString(),data.getTime(),String.valueOf(data.getDay_count()),String.valueOf(data.getCharge()),data.getVehicle_type(),String.valueOf(data.getPassengers_count()),String.valueOf(data.isGot_hire())};
        boolean added = dbHandle.setData(writableDatabase, sql, values, 1);
        return added;

    }

    public boolean deleteSMS(String sms_id){
        String sql = "delete from messages where message_id=?";
        String values[] = {sms_id};
        boolean deleted = dbHandle.setData(writableDatabase, sql, values,2);
        return deleted;
    }

    public boolean updateSMS(String sms_id){
        String sql = "update messages set got_hire = true where message_id=?";
        String values[] = {sms_id};
        boolean updated = dbHandle.setData(writableDatabase, sql, values,2);
        return updated;
    }

}
