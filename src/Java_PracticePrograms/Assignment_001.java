package Java_PracticePrograms;

//Java Program to Print maximum among two numbers using if-else.

import java.util.Scanner;

public class Assignment_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();



        if (num1>num2)
        {
            System.out.println("The Max number is "+num1);
        }
        else
        {
            System.out.println("The Max number is "+num2);
        }
/*
        int result;
        result = (num1>num2)? num1 : num2;
        System.out.println("The maximum number is " +result);

*/
    }

}
