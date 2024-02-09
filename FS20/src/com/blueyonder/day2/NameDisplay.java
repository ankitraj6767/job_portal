package com.blueyonder.day2;

import java.util.Scanner;

public class NameDisplay {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Nice to meet you.");
    }
}
