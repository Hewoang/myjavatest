package com.javatest.date_calendar_localDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt = LocalDateTime.now();//LocalDate.new(); LocalTime.new();
        System.out.println(ldt);

        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(ldt));

        System.out.println(ldt.getYear());
        System.out.println("Month: " + ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());


    }
}
