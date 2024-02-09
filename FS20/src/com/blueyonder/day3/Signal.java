package com.blueyonder.day3;

import java.util.Scanner;
import java.util.Random;

public class Signal {

    public static void main(String[] args) {
        String[] states = {"Red", "Yellow", "Green"};
        Random rand=new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter 0 to show the signal status and 1 to exit: ");
            int choice = sc.nextInt();
            if (choice == 1)
                break;
            System.out.println("The signal is showing: "+states[rand.nextInt(3)]);
            System.out.println();
        } while (true);
    }
}
