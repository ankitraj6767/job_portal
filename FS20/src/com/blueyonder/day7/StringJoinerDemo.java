package com.blueyonder.day7;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joinNames=new StringJoiner(",","[","]");
        joinNames.add("Arjun");
        joinNames.add("Bilas");
        joinNames.add("Chirag");

        StringJoiner anotherJoinNames=new StringJoiner(",");
        joinNames.add("Dheeraj");
        joinNames.add("Eshwar");
        joinNames.add("Farhan");

        joinNames.merge(anotherJoinNames);
        System.out.println(joinNames);
    }
}
