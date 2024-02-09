package com.blueyonder.day9;

public class DebuggerDemo {

    public static void main(String[] args) {
        int a=1;
        if(a==0)
            System.out.println("a is zero");
        else if(a==1)
            System.out.println("a is one");

        int b=5;
        System.out.println("increment b: "+(b++));
    }
}
