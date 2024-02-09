package com.blueyonder.day3.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        try {
            float c = a / b;
            System.out.println("The quotient of " + a + "/" + b + " = " + c);
            if (c > 10)
                throw new IOException("Sorry");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed.");
        } catch (IOException ioException) {
            System.out.println("Custom exception:" + ioException.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Completed");
        }
    }
}
