package com.blueyonder.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperations {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(now.format(format));
        System.out.println(now.getDayOfMonth());
        LocalDateTime bday=LocalDateTime.of(1999,8,6,9,32);
        System.out.println(now.minusDays(100).format(format));
        System.out.println(bday.plusYears(10));
    }
}
