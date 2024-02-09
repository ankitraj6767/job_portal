package com.blueyonder.day4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list1.addAll(1,list2);
        System.out.println(list2);
        System.out.println(list1);

        list1.remove(2);
        list1.set(2,9);
        System.out.println(list1.get(3));
        System.out.println(list1);

        Collections.sort(list1);
        // or
        list1.sort(null);
        System.out.println(list1);

        System.out.println(list1.size());

        list1.indexOf(10);

        System.out.println(list1.contains(5));

        // Vector
        int capacity=10;
        List<Integer> v=new Vector<>(capacity,5);
    }
}
