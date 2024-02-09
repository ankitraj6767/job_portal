package com.blueyonder.day3;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsII {

    public static void main(String[] args) {
        int numberOfFriends = 3;
        Scanner sc = new Scanner(System.in);
        String[][] friends = new String[numberOfFriends][2];
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.print("Enter full name of friend #" + (i + 1) + ": ");
            String friend = sc.nextLine();
            String[] name = friend.split(" ");
            friends[i][0] = name[0];
            friends[i][1] = name[1];
        }
        System.out.println("Your friends are: ");
        Arrays.stream(friends).forEach(p->System.out.println(p[0]+" "+p[1]));
        sc.close();
    }
}
