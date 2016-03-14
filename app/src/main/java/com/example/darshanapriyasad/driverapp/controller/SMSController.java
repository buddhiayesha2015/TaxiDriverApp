package com.example.darshanapriyasad.driverapp.controller;

import com.example.darshanapriyasad.driverapp.dbaccess.SMSDBAccess;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class SMSController {

    private SMSDBAccess smsdbAccess;

    public SMSController(){
        smsdbAccess = new SMSDBAccess();
    }

}
