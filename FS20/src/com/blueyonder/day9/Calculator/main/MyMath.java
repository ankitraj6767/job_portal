package com.blueyonder.day9.Calculator.main;

public class MyMath {

    public long add(int a, int b) {
        return (a + b);
    }

    public int divide(int a, int b)
    {
        try
        {
            return a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error");
            throw e;
        }
    }
}
