package com.blueyonder.day5.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Location l1=new Location(80.2f,165.7f,"Hyderabad");
        Location l2=new Location(100.6f,200.2f,"Bangalore");
        Address a1=new Address("Ideal","LIC","Kolkata",700129);
        Address a2=new Address("PHC","Dwarka","Delhi",100078);


        Employee e1=new Employee(1,"Ram","Manager",l1,a1);
        Employee e2=new Employee(2,"Rajiv","Director",l2,a2);
        Employee e3=new Employee(3,"Amit","SDE",l1,a1);
        Employee e4=new Employee(4,"Sam","HR",l1,a2);
        Employee e5=new Employee(5,"John","CEO",l2,a1);

        Employee[] employees={e1,e2,e3,e4,e5};
        List<Employee> hyderabadEmployees = Arrays.stream(employees).filter(e-> Objects.equals(e.getLocation().getName(), "Hyderabad")).toList();
        List<Employee> bangaloreEmployees = Arrays.stream(employees).filter(e-> Objects.equals(e.getLocation().getName(), "Bangalore")).toList();
        System.out.println("Hyderabad Employees: "+hyderabadEmployees);
        System.out.println("Bangalore Employees: "+bangaloreEmployees);
    }
}
