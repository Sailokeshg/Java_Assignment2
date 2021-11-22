package com.javaassignments.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kyc {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void getRange(String registerDate,String today) throws ParseException {
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(simpleDateFormat.parse(today));
        Calendar signUpDate = Calendar.getInstance();
        signUpDate.setTime(simpleDateFormat.parse(registerDate));
        if(signUpDate.getTime().after(currentDate.getTime()))   //When current date is falling before sing-up date.
            System.out.println("No range");
        else
            RangeCalculator.calculateRange(signUpDate,currentDate);
    }

}
