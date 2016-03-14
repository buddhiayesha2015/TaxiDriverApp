package com.example.darshanapriyasad.driverapp.model;

import java.util.Date;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class SMS {

    private String sms_id;
    private String customer_name;
    private String from_location;
    private String to_location;
    private Date date;
    private String time;
    private int day_count;
    private double charge;
    private String vehicle_type;
    private int passengers_count;
    private boolean got_hire;


    public  SMS(){

    }

    public SMS(String sms_id, String customer_name, String from_location, String to_location, Date date, String time, int day_count, String vehicle_type,double charge, int passengers_count,boolean got_hire) {
        this.sms_id = sms_id;
        this.customer_name = customer_name;
        this.from_location = from_location;
        this.to_location = to_location;
        this.date = date;
        this.time = time;
        this.day_count = day_count;
        this.vehicle_type = vehicle_type;
        this.passengers_count = passengers_count;
        this.got_hire = got_hire;
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public boolean isGot_hire() {
        return got_hire;
    }

    public void setGot_hire(boolean got_hire) {
        this.got_hire = got_hire;
    }

    public String getSms_id() {
        return sms_id;
    }

    public void setSms_id(String sms_id) {
        this.sms_id = sms_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getFrom_location() {
        return from_location;
    }

    public void setFrom_location(String from_location) {
        this.from_location = from_location;
    }

    public String getTo_location() {
        return to_location;
    }

    public void setTo_location(String to_location) {
        this.to_location = to_location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDay_count() {
        return day_count;
    }

    public void setDay_count(int day_count) {
        this.day_count = day_count;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public int getPassengers_count() {
        return passengers_count;
    }

    public void setPassengers_count(int passengers_count) {
        this.passengers_count = passengers_count;
    }
}
