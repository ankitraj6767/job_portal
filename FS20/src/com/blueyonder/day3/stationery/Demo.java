package com.blueyonder.day3.stationery;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: 1 - Create Ball Pen | 2 - Create Ink Pen | 3 - Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    Pen ballPen=createPenOfChoice(true);
                    ballPen.write();
                    break;
                case 2:
                    Pen inkPen=createPenOfChoice(false);
                    inkPen.write();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice!=3);
    }

    public static Pen createPenOfChoice(boolean type)
    {
        if (type)
            return new BallPen();
        else
            return new InkPen();
    }
}
