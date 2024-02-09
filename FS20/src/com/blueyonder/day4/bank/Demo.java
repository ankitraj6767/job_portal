package com.blueyonder.day4.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Person person1 = new Person("Nilanjana", Long.parseLong("9876543210"));
        Person person2 = new Person("Ram", Long.parseLong("8216982687"));
        HashMap<String, Account> map = new HashMap<>();
        Account account1 = new Account(Long.parseLong("1302937465"), Type.SAVINGS, 5000.50);
        map.put(person1.name, account1);
        Account account2 = new Account(Long.parseLong("1308935672"), Type.CURRENT, 19000.50);
        map.put(person2.name, account2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int choice;
        do {
            System.out.print("\nMenu: 1 - Deposit | 2 - Show Balance | 3 - Withdraw | 4 - Exit\nEnter your choice: ");
            choice = sc.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    map.get(name).deposit(amount);
                    System.out.println("Deposited");
                    break;
                case 2:
                    System.out.println("Your " + map.get(name).getType() + " account balance is " + map.get(name).showBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    if (map.get(name).withdraw(amount))
                        System.out.println("Withdrawn");
                    else
                        System.out.println("Insufficient balance.");
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        } while (choice != 4);
    }
}
