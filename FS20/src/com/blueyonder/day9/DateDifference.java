package com.blueyonder.day9;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class DateDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime date1 = null, date2 = null;
        try {
            System.out.println("Enter the first date: ");
            System.out.print("Day: ");
            int day1 = sc.nextInt();
            System.out.print("Month: ");
            int month1 = sc.nextInt();
            System.out.print("Year: ");
            int year1 = sc.nextInt();
            date1 = LocalDateTime.of(year1, month1, day1, 0, 0);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Mismatched input.");
            exit(0);
        } catch (DateTimeException dateTimeException) {
            System.out.println("Invalid date input.");
            exit(0);
        }

        try {
            System.out.println("Enter the second date: ");
            System.out.print("Day: ");
            int day2 = sc.nextInt();
            System.out.print("Month: ");
            int month2 = sc.nextInt();
            System.out.print("Year: ");
            int year2 = sc.nextInt();
            date2 = LocalDateTime.of(year2, month2, day2, 0, 0);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Mismatched input.");
            exit(0);
        } catch (DateTimeException dateTimeException) {
            System.out.println("Invalid date input.");
            exit(0);
        }
        if (date1.isAfter(date2)) {
            LocalDateTime temp = date1;
            date1 = date2;
            date2 = temp;
        }
        long dd = date1.until(date2, ChronoUnit.DAYS);
        System.out.println("There are " + dd + " days between the two dates.");
    }
}
