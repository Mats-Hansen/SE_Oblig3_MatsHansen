package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void theseNumbersAreDivisibleBy4ButNot100() {
        assertTrue(Main.isLeapYear(4));
        assertTrue(Main.isLeapYear(8));
        assertTrue(Main.isLeapYear(16));
        assertTrue(Main.isLeapYear(20));
        assertTrue(Main.isLeapYear(24));
        assertTrue(Main.isLeapYear(28));

        assertTrue(Main.isLeapYear(104));
        assertTrue(Main.isLeapYear(108));
        assertTrue(Main.isLeapYear(112));
        assertTrue(Main.isLeapYear(116));
        assertTrue(Main.isLeapYear(120));
    }

    @Test
    public void theseNumbersAreDivisibleBy4And100() {
        assertFalse(Main.isLeapYear(100));
        assertFalse(Main.isLeapYear(200));
        assertFalse(Main.isLeapYear(300));
        assertFalse(Main.isLeapYear(500));
        assertFalse(Main.isLeapYear(600));
        assertFalse(Main.isLeapYear(700));
    }

    @Test
    public void theseNumbersAreNotDivisibleBy4() {
        assertFalse(Main.isLeapYear(3));
        assertFalse(Main.isLeapYear(5));
        assertFalse(Main.isLeapYear(7));
        assertFalse(Main.isLeapYear(9));
        assertFalse(Main.isLeapYear(15));
        assertFalse(Main.isLeapYear(17));

        assertFalse(Main.isLeapYear(99));
        assertFalse(Main.isLeapYear(101));
        assertFalse(Main.isLeapYear(199));
        assertFalse(Main.isLeapYear(201));
        assertFalse(Main.isLeapYear(299));
        assertFalse(Main.isLeapYear(301));
    }

    @Test
    public void theseNumbersAreDivisibleBy400() {
        assertTrue(Main.isLeapYear(400));
        assertTrue(Main.isLeapYear(800));
        assertTrue(Main.isLeapYear(1200));
        assertTrue(Main.isLeapYear(1600));
        assertTrue(Main.isLeapYear(2000));
        assertTrue(Main.isLeapYear(2400));
        assertTrue(Main.isLeapYear(2800));
        assertTrue(Main.isLeapYear(3200));
        assertTrue(Main.isLeapYear(3600));
        assertTrue(Main.isLeapYear(4000));
    }


    @Test
    public void theseYearsAreLeapYears() {
        assertTrue(Main.isLeapYear(1980));
        assertTrue(Main.isLeapYear(1984));
        assertTrue(Main.isLeapYear(1988));
        assertTrue(Main.isLeapYear(1992));
        assertTrue(Main.isLeapYear(1996));
        assertTrue(Main.isLeapYear(2000));
        assertTrue(Main.isLeapYear(2004));
        assertTrue(Main.isLeapYear(2008));
        assertTrue(Main.isLeapYear(2012));
        assertTrue(Main.isLeapYear(2016));
        assertTrue(Main.isLeapYear(2020));
        assertTrue(Main.isLeapYear(2024));
    }

    @Test
    public void theseYearsAreNotLeapYears() {
        assertFalse(Main.isLeapYear(1981));
        assertFalse(Main.isLeapYear(1982));
        assertFalse(Main.isLeapYear(1983));
        assertFalse(Main.isLeapYear(1985));
        assertFalse(Main.isLeapYear(1986));
        assertFalse(Main.isLeapYear(1987));
        assertFalse(Main.isLeapYear(1989));
        assertFalse(Main.isLeapYear(1990));
        assertFalse(Main.isLeapYear(1991));
        assertFalse(Main.isLeapYear(1993));
        assertFalse(Main.isLeapYear(1994));
        assertFalse(Main.isLeapYear(1995));
        assertFalse(Main.isLeapYear(1997));
        assertFalse(Main.isLeapYear(1998));
        assertFalse(Main.isLeapYear(1999));
        assertFalse(Main.isLeapYear(2001));
        assertFalse(Main.isLeapYear(2002));
        assertFalse(Main.isLeapYear(2003));
        assertFalse(Main.isLeapYear(2005));
        assertFalse(Main.isLeapYear(2006));
        assertFalse(Main.isLeapYear(2007));
        assertFalse(Main.isLeapYear(2009));
        assertFalse(Main.isLeapYear(2010));
        assertFalse(Main.isLeapYear(2011));
        assertFalse(Main.isLeapYear(2013));
        assertFalse(Main.isLeapYear(2014));
        assertFalse(Main.isLeapYear(2015));
        assertFalse(Main.isLeapYear(2017));
        assertFalse(Main.isLeapYear(2018));
        assertFalse(Main.isLeapYear(2019));
        assertFalse(Main.isLeapYear(2021));
        assertFalse(Main.isLeapYear(2022));
        assertFalse(Main.isLeapYear(2023));
        assertFalse(Main.isLeapYear(2025));
    }
}

