package org.example;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Write a year to check if it's a leap year: ");
            int year = input.nextInt();
            boolean check = isLeapYear(year);
            if (check) {
                System.out.println(year + " is a leap year! 😁");
            } else {
                System.out.println(year + " is not a leap year! 😒");
            }

            System.out.println();
            System.out.println("Want to check another year? (Q to quit / ENTER to continue): ");
            if (input.nextLine().equals("q") || input.nextLine().equals("Q")) {
                break;
            }

        }
    }
    public static boolean isLeapYear(int year) {
        // Sjekker om årstallet er delelig på 4
        // men ikke delelig på 100
        // eller om det er delelig på 400
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}




