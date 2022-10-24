package org.example;

public class Main {
    public static void main( String[] args ) {

    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
        } return false;
    }




}




