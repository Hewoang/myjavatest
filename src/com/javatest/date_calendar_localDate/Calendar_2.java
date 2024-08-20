package com.javatest.date_calendar_localDate;

import java.util.Calendar;

public class Calendar_2 {
    public static void main(String[] args) {
        //Calendar是抽象类 且 构造器私有
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        //月份从 0 开始
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));//毫秒
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
    }
}
