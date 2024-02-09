package com.blueyonder.day4;

import java.util.Arrays;

public class PriceSort {

    public static void main(String[] args) {
        double[] prices ={55.25,77.25,48.50,10.00};
        Arrays.sort(prices);
        System.out.println("The sorted price array is: "+Arrays.toString(prices));
    }
}
