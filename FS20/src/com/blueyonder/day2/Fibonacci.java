package com.blueyonder.day2;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println("The first 20 terms of the Fibonacci Series are: ");
        System.out.print(a+" "+b);
        for(int i=0;i<18;i++)
        {
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
