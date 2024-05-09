package Java_PracticePrograms;

import java.util.Scanner;

//Java program to check whether a year is leap year or not using if-else.
public class Assignment_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if((year%4==0)&&(year%100!=0))
        {
            System.out.println("Its a Leap year!!!");
        }
        else
        {
            System.out.println("Its not an Leap year");
        }
    }
}
