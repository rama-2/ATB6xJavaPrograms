package Java_PracticePrograms;

import java.util.Scanner;

//Java Program to check whether a given number is divisble by 3 or not using if-else
public class Assignment_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();

        if(num1%3==0)
        {
            System.out.println("Divisible by 3");
        }
        else
        {
            System.out.println("Not divisible by 3");
        }
    }
}
