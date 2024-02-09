package com.blueyonder.day1.interest;

public class InterestCalculatorWithValues {

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(Double.parseDouble(args[0]), Integer.parseInt(args[1]), Double.parseDouble(args[2]));
        double finalAmount = si.calculateSI();
        System.out.println("\nThe final amount is: " + finalAmount);
    }
}
