package com.blueyonder.day2.inheritance;

public class SingleInheritanceDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setId(1);
        Manager manager=new Manager(2,"Jack","QA Engineer",5000,10);
    }
}
