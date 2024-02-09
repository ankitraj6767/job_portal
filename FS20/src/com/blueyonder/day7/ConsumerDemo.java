package com.blueyonder.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> display = System.out::println;
        Consumer<List<Integer>> doubling = list->
        {
            list.replaceAll(integer -> 2 * integer);
        };

        Consumer<List<Integer>> dispList=list->
                list.forEach(a-> System.out.print(a+" "));
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        doubling.accept(list);
        dispList.accept(list);
    }
}