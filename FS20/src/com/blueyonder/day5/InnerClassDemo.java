package com.blueyonder.day5;

public class InnerClassDemo {
    static class Stranger {
        private String name = "Nilanjana";
        private String city = "Kolkata";
    }

    static class AnotherStranger {
        private String name = "Nilanjana";
        private String city = "Kolkata";
    }

    public static void main(String[] args) {
        InnerClassDemo.Stranger anonymous=new Stranger();
        System.out.println(anonymous.name);
        System.out.println(anonymous.city);
        InnerClassDemo.AnotherStranger a= new AnotherStranger();
        System.out.println(a.city);
    }
}
