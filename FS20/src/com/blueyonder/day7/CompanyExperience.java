package com.blueyonder.day7;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CompanyExperience {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        System.out.print("Enter your day of joining BY: ");
        int day=sc.nextInt();
        System.out.print("Enter your month of joining BY: ");
        int month=sc.nextInt();
        System.out.print("Enter your year of joining: ");
        int year=sc.nextInt();
        LocalDateTime bday=LocalDateTime.of(year,month,day,0,0);
        long yy=bday.until(now, ChronoUnit.YEARS);
        long mm=bday.until(now, ChronoUnit.MONTHS)-yy*12;
        long dd=bday.until(now, ChronoUnit.DAYS)-yy*365-mm*30;
        System.out.println(yy+" "+mm+" "+dd);
    }
}
