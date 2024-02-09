package com.blueyonder.day4.company;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Nilanjana");
        employee.setDepartment(Department.OPERATIONS);

        serializeObject(employee,"C:\\Users\\user\\IdeaProjects\\FS20\\src\\com\\blueyonder\\day4\\company\\emp.txt");
        Employee employee1=deserializeObject("C:\\Users\\user\\IdeaProjects\\FS20\\src\\com\\blueyonder\\day4\\company\\emp.txt");
    }

    public static void serializeObject(Employee employee, String path) throws IOException
    {
        File empFile = new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(empFile)) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(employee);
                System.out.println("Object is stored in emp.txt file.");
            }
        }
    }

    public static Employee deserializeObject(String path) throws IOException, ClassNotFoundException {
        File empFile = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(empFile)) {
            try (ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream)) {
                Employee employee=(Employee)objectOutputStream.readObject();
                System.out.println(employee);
                return employee;
            }
        }
    }
}
