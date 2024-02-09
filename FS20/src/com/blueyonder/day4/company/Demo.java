package com.blueyonder.day4.company;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Employee> employees=new HashMap<>();
        int choice;
        do {
            System.out.print("\nMenu: 1 - Add Employee | 2 - Show Employee Department | 3 - Exit\nEnter your choice: ");
            choice=sc.nextInt();
            int id;
            String name;
            Department department = null;
            switch (choice)
            {
                case 1:
                    System.out.println("Enter employee details");
                    do {
                        System.out.print("ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        if(employees.containsKey(id))
                            System.out.println("Duplicate Employee ID, please re-enter.");
                        else
                            break;
                    } while (true);
                    System.out.print("Name: ");
                    name= sc.nextLine();
                    boolean flag;
                    do {
                        flag=true;
                        System.out.print("Department: ");
                        String deptString=sc.nextLine().toUpperCase();
                        switch (deptString)
                        {
                            case "SALES":
                                department=Department.SALES;
                                break;
                            case "OPERATIONS":
                                department=Department.OPERATIONS;
                                break;
                            case "EDP":
                                department=Department.EDP;
                                break;
                            default:
                                flag=false;
                                System.out.println("Invalid department name. Please re-enter.");
                        }
                    }while (!flag);
                    Employee e=new Employee(id,name,department);
                    employees.put(id,e);
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    id= sc.nextInt();
                    sc.nextLine();
                    if(employees.containsKey(id))
                        System.out.println(employees.get(id).getName()+" is in "+employees.get(id).getDepartment());
                    else
                        System.out.println("Employee does not exist.");
                    break;
                case 3:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid selection, please re-enter.");
            }
        }while(choice!=3);
    }
}
