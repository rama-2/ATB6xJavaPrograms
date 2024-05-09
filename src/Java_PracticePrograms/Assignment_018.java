package Java_PracticePrograms;

import java.util.Scanner;

//Java Program to print sum of odd numbers between 1 to n using while loop
public class Assignment_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int result =0;
        while(num>0)
        {
            if (num%2 !=0)
            {
               result = result +num;
            }
            num= num-1;
        }
        System.out.println(result);
    }
}
