package com.blueyonder.day3.strings;

import java.util.Scanner;

public class MyString{

    public static void main(String[] args) {
        String myName=acceptName();

        System.out.println("Length: "+myName.length());
        System.out.println("Reverse: "+reverse(myName));
    }

    public static String acceptName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        return(sc.nextLine());
    }

    public static String reverse(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
