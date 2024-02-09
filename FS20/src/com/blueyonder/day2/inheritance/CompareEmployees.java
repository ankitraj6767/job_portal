package com.blueyonder.day2.inheritance;

public class CompareEmployees {

    public static void main(String[] args) {
        Employee e1=new Employee(1030642,"John","Director");
        Employee e2=new Employee(1030642,"John","Director");
        Manager m1=new Manager(1030642,"John","Director",5000,10);
        System.out.println(e1);
        System.out.println(m1);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(m1));
    }
}
