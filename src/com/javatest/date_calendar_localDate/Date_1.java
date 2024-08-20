package com.javatest.date_calendar_localDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date1));
    }
}
