package com.blueyonder.day8.threadtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShowTime extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            LocalDateTime now=LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            System.out.println(now.format(format));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
