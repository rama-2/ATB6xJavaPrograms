package Lab_02052024;

import java.util.Scanner;

public class Lab_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];

        System.out.println("Enter 1st Subject Marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter 2nd Subject Marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter 3rd Subject Marks");
        marks[2] = sc.nextInt();
        System.out.println("Enter 4th Subject Marks");
        marks[3] = sc.nextInt();
        System.out.println("Enter 5th Subject Marks");
        marks[4] = sc.nextInt();
        System.out.println("Enter 6th Subject Marks");
        marks[5] = sc.nextInt();

        for (int i = 0; i <marks.length-1; i++)
        {
            if(marks[i]>=36)
            {
                System.out.println("You are Passed");
            }
            else
            {
                System.out.println("You are Failed");
            }
            System.out.println(marks[i]);
        }



    }
}
