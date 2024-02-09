package com.blueyonder.day1.interest;

import java.util.Scanner;

public class SimpleInterest {

    double principalAmount, month, rateOfInterest;

    /**
     * @param principalAmount principal amount
     * @param month           number of months
     * @param rateOfInterest  rate of interest per annum
     */
    public SimpleInterest(double principalAmount, double month, double rateOfInterest) {
        this.principalAmount = principalAmount;
        this.month = month;
        this.rateOfInterest = rateOfInterest;
    }

    /**
     * @return principal + simple interest
     */
    public double calculateSI() {
        return (1 + (rateOfInterest / 100 * month / 12)) * principalAmount;
    }
}

class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principalAmount = sc.nextDouble();
        System.out.print("Enter the number of months: ");
        double month = sc.nextDouble();
        System.out.print("Enter the rate of interest per annum: ");
        double rateOfInterest = sc.nextDouble();
        SimpleInterest si = new SimpleInterest(principalAmount, month, rateOfInterest);
        double finalAmount = si.calculateSI();
        System.out.println("\nThe final amount is: " + finalAmount);
    }
}
