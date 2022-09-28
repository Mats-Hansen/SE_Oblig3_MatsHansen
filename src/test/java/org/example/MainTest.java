package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest
{
    // Tester av isLeapYear() metoden
    @Test
    void year2000ShouldBeALeapYear() {
        assertTrue(Main.isLeapYear(2000));
        assertEquals(true, Main.isLeapYear(2000));
    }

    @Test
    void year2001ShouldNotBeALeapYear() {
        assertFalse(Main.isLeapYear(2001));
    }

    @Test
    void year2004ShouldBeALeapYear() {
        assertTrue(Main.isLeapYear(2004));
    }

    @Test
    void year1600ShouldBeALeapYear() {
        assertTrue(Main.isLeapYear(1600));
    }

    @Test
    void year1700ShouldNotBeALeapYear() {
        assertFalse(Main.isLeapYear(1700));
    }

    @Test
    void year1800ShouldNotBeALeapYear() {
        assertFalse(Main.isLeapYear(1800));
    }

    @Test
    void year1900ShouldNotBeALeapYear() {
        assertFalse(Main.isLeapYear(1900));
    }

    @Test
    void checkAllLeapYearsInFile() {

    }
}
