package Java_PracticePrograms;

import java.util.Scanner;

//Java program to print maximum among three numbers using if-else
public class Assignment_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int result1 = Math.max(num1,num2);//105, 32333
        int result2 = Math.max(num1,num3);//105,609

        if (result1>result2)
        {
            System.out.println("The Max number is "+result1);
        }
        else
        {
            System.out.println("The Max numer is "+result2);
        }


    }
}
