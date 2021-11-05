package com.example.project;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return false;
            } else return year % 100 != 0;
        }
        return false;
    }
}
