package com.blueyonder.day4;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(100);
        for(int i=0;i<100;i++)
            numbers.add(1);
        for(int i=2;i<99;i++)
        {
            if(numbers.get(i)<0)
                continue;
            for(int j=2*i;j<100;j+=i)
                numbers.set(j, -1);
        }
        System.out.println("The prime numbers below 100 are: ");
        for(int i=2;i<100;i++)
            if(numbers.get(i)>0)
                System.out.print((i)+" ");
    }
}
