package com.blueyonder.day2;

import java.util.Scanner;

public class AddTwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
    }
}
