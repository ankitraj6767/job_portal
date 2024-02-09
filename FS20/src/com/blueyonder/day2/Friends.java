package com.blueyonder.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Friends {

    public static void main(String[] args) {
        int numberOfFriends = 5;
        Scanner sc = new Scanner(System.in);
        String[] friends = new String[numberOfFriends];
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.print("Enter name of friend #" + (i + 1) + ": ");
            String friend = sc.nextLine();
            friends[i] = friend;
        }
        System.out.println("Your friends are: ");
        Arrays.stream(friends).forEach(System.out::println);
    }
}
