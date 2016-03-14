package com.example.darshanapriyasad.driverapp.controller;

import com.example.darshanapriyasad.driverapp.dbaccess.DriverDBAccess;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class DriverController {

    private DriverDBAccess driverDBAccess;

    public DriverController(){
        driverDBAccess = new DriverDBAccess();
    }

    public String isValidDriver(String user_name,String password){
        return driverDBAccess.isValidDriver(user_name,password);
    }

    public boolean isRegisterd(){
        return driverDBAccess.isRegistered();
    }

    public boolean addDriver(String driver_id,String user_name,String password){
        return driverDBAccess.addDriver(driver_id,user_name,password);
    }
}
