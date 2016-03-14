package com.example.darshanapriyasad.driverapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.darshanapriyasad.driverapp.support.SMSReader;

public class DriverAccept extends AppCompatActivity {

    private TextView fromLocation;
    private TextView toLocation;
    private TextView date;
    private TextView time;
    private TextView dayCont;
    private TextView amount;
    private TextView vehicleType;
    private TextView passengerCount;
    private TextView customerName;
    private Button acceptButton;
    private Button backButton;

    private String sms_id;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_accept);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fromLocation = (TextView) findViewById(R.id.fromLocationText);
        toLocation = (TextView) findViewById(R.id.toLocationText);
        date = (TextView) findViewById(R.id.dateText);
        time = (TextView) findViewById(R.id.timeText);
        dayCont = (TextView) findViewById(R.id.dayCountText);
        amount = (TextView) findViewById(R.id.amountText);
        vehicleType = (TextView) findViewById(R.id.typeText);
        passengerCount = (TextView) findViewById(R.id.passCountText);
        customerName = (TextView) findViewById(R.id.nameText);

        acceptButton = (Button) findViewById(R.id.acceptButton);
        backButton = (Button) findViewById(R.id.backButton);



        setDetail(new SMSReader().readSMS());

        acceptButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });


    }


    public void setDetail(String[] values){
        customerName.setText("Customer Name : " + values[0]);
        fromLocation.setText("From Location : " + values[1]);
        toLocation.setText("To Location : " + values[2]);
        date.setText("From Date : " + values[3]);
        time.setText("Start Time : " + values[4]);
        dayCont.setText("Day Count : " + values[5]);
        amount.setText("Maximum Payable Price : " + values[6]);
        vehicleType.setText("Vehicle Type : " + values[7]);
        passengerCount.setText("Passenger Count : " + values[8]);

        sms_id = values[9];
    }

}
