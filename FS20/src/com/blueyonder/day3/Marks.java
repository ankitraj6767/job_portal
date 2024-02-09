package com.blueyonder.day3;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int numberOfStudents = 2, numberOfSubjects = 3;
        String[] subjectNames = {"Computer", "Maths", "English"};
        int[][] marksScored = new int[numberOfStudents][numberOfSubjects];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nFor student #" + (i + 1) + ": ");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter the marks of " + subjectNames[j] + ": ");
                marksScored[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.format("%15s","Subject");
        for(int i=0;i<numberOfStudents;i++)
        {
            System.out.format("%15s","Student #"+(i+1));
        }
        System.out.println();
        for(int i=0;i<numberOfSubjects;i++)
        {
            System.out.format("%15s",subjectNames[i]);
            for(int j=0;j<numberOfStudents;j++)
            {
                System.out.format("%15d",marksScored[j][i]);
            }
            System.out.println();
        }
    }
}
