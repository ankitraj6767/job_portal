package com.blueyonder.day2;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number < 100: ");
            n=sc.nextInt();
            if(n>=100)
                System.out.println("Number out of range, please re-enter.");
            else
                break;
        } while(true);
        System.out.println("The binary form of "+n+" = "+decToBin(n));
    }

    static String decToBin(int n)
    {
        StringBuilder binary= new StringBuilder();
        while(n>0)
        {
            if((n&1)==1)
                binary.append('1');
            else
                binary.append('0');
            n=n>>1;
        }
        return binary.reverse().toString();
    }
}
