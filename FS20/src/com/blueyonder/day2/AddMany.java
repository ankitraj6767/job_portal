package com.blueyonder.day2;

public class AddMany {

    public static void main(String[] args) {
        long sum=0;
        for(String num: args)
            sum+=Integer.parseInt(num);
        System.out.println("Sum = "+sum);
    }
}
