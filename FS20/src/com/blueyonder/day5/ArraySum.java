package com.blueyonder.day5;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] rank={123,52,1,7,529};
        int sum=Arrays.stream(rank).sum();
        System.out.println(sum);
    }
}
