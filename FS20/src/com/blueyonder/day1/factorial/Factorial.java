package com.blueyonder.day1.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String [] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" = "+findFactorial(n));
    }

    static long findFactorial(int n)
    {
        if(n==0||n==1)
            return 1;
        long fact=1;
        while(n>1)
        {
            fact*=n;
            n--;
        }
        return fact;
    }
}
