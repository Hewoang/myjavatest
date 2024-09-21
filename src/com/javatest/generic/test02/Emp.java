package com.javatest.generic.test02;


public class Emp {
    private String name;
    private double sal;
    MyDate myDate;

    static class MyDate {
        private int year;
        private int month;
        private int day;
        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int compareTo(MyDate o) {
            int a=year - o.getYear();
            if (a==0){
                int b=month - o.getMonth();
                if (b==0){
                    int c=day - o.getDay();
                    return c;
                }
                return b;
            }
            return a;
        }
        @Override
        public String toString() {
            return year +"-"+month+"-" + day ;
        }
    }

    public Emp(String name, double sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", myDate=" + myDate +
                '}';
    }
}
