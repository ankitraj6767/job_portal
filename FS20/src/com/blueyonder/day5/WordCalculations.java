package com.blueyonder.day5;

import java.util.HashMap;
import java.util.Scanner;

public class WordCalculations {
    public static void main(String[] args) {

        int lines = 4;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> frequency= new HashMap<>();
        int wordCount=0;
        System.out.println("Enter 4 lines of text:");
        for (int i = 0; i < lines; i++) {
            String string=sc.nextLine();
            String[] strings=string.split(" ");
            wordCount+=strings.length;
            for(String s:strings) {
                int count= frequency.getOrDefault(s, 0);
                frequency.put(s,count+1);
            }
        }
        System.out.println("The total number of words: "+wordCount+"\nThe repeated words are: ");
        frequency.forEach((key,value)->
        {
            if(value>1)
                System.out.print(key+" ("+value+") ");
        });
    }
}
