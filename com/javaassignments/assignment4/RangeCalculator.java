package com.javaassignments.assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RangeCalculator {

    public static void calculateRange(Calendar signUpDate, Calendar currentDate){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        int currentYear = currentDate.get(Calendar.YEAR);
        //setting the singUpDate to the anniversary of the current year
        signUpDate.set(Calendar.YEAR,currentYear);
        signUpDate.add(Calendar.DATE,30);         ////added +30 days to anniversary to get maximum range
        Date maximumDate = signUpDate.getTime();
        signUpDate.add(Calendar.DATE,-60);
        Date minimumDate = signUpDate.getTime();     //added -60 days to anniversary to get minimum range
        if(maximumDate.compareTo(currentDate.getTime())<0)
            System.out.println(simpleDateFormat.format(minimumDate)+" "+simpleDateFormat.format(maximumDate));
        else
            System.out.println(simpleDateFormat.format(minimumDate)+" "+simpleDateFormat.format(currentDate.getTime()));
    }
}
