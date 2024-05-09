package Java_PracticePrograms;

import java.util.Scanner;

//Java program to check whether a given number is even or odd using if else
public class Assignment_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if even or odd");
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Its an Even number");
        }
        else {
            System.out.println("Its an odd number");
        }
    }
}
