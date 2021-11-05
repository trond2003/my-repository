package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTests {

    @Test
    public void Find_Leap_year() {
        assertEquals(true, LeapYear.isLeapYear(4));
        assertEquals(true, LeapYear.isLeapYear(1236));
        assertEquals(true, LeapYear.isLeapYear(1864));
        assertEquals(true, LeapYear.isLeapYear(2384));
        assertEquals(true, LeapYear.isLeapYear(404));
        assertEquals(false, LeapYear.isLeapYear(400));
        assertEquals(false, LeapYear.isLeapYear(3333));
        assertEquals(false, LeapYear.isLeapYear(1700));
    }
}