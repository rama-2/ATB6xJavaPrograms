package Java_PracticePrograms;

import java.util.Scanner;
//Java Program to check whether a given number is divisble by 11 or not using if-else
public class Assignment_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();

        if(num1%11==0)
        {
            System.out.println("Divisible by 11");
        }
        else
        {
            System.out.println("Not divisible by 11");
        }
    }
}
