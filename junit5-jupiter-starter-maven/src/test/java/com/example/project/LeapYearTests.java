package com.example.project;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTests {
    @Nested
    public class Year_is_leap_year {
        @ParameterizedTest
        @ValueSource(ints = {2016, 2012, 1976, 4})
        public void when_divisible_by_4_but_not_100(int year) {
            assertTrue(LeapYear.isLeapYear(year));
        }
        @ParameterizedTest
        @ValueSource(ints = {2000, 1600, 400})
        public void when_divisible_by_400(int year) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }
    @Nested
    public class Year_is_not_leap_year {
        @ParameterizedTest
        @ValueSource(ints = {2017, 2013, 2001, 1989, 3})
        public void when_not_divisible_by_4(int year) {
            assertFalse(LeapYear.isLeapYear(year));
        }
        @ParameterizedTest
        @ValueSource(ints = {1900, 1800, 1700})
        public void when_divisible_by_100_but_not_400(int year) {
            assertFalse(LeapYear.isLeapYear(year));
        }
    }
}