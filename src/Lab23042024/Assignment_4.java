package Lab23042024;

import javax.swing.*;
import java.util.Scanner;

//Program to Check if a Year is a Leap Year or Not:
public class Assignment_4 {

    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Its a leap year!!!!");
            } else {
                System.out.println("Its an non leap year!!!!!");
            }
        } else {
            System.out.println("Its an non leap year!!!!!");
        }
        sc.close();
    }
}
