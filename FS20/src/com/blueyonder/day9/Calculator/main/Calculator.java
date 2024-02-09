package com.blueyonder.day9.Calculator.main;

public class Calculator extends Device {

    public Calculator getDetails()
    {
        System.out.println("CASIO");
        return new Calculator();
    }

    public long add(int a, int b)
    {
        return a+b;
    }

    public long findFactorial(int n)
    {
        if(n==0)
            return 1;
        return n*findFactorial(n-1);
    }

    @Override
    public void showDevice() {
        super.showDevice();
    }
}
