package com.javatest.enumeration;

public enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY;

    private String date;

    Week(){

    }

    Week(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date;
    }

//    public int getOL() {
//        return super.ordinal();
//    }
}
