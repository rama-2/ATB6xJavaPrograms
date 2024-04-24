package Lab23042024;

import java.util.Scanner;

//Program to Print Multiples of 3 as Fizz, Multiples of 5 as Buzz and Multiples of 3 and 5 as FizzBuzz
public class Assignment_5
{
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if ((num%3==0) && (num%5==0))
        {
            System.out.println("FizzBuzz");
        } else if (num%5==0)
        {
            System.out.println("Buzz");
        } else if (num%3==0)
        {
            System.out.println("Fizz");
        }
        else
            System.out.println(num);

        sc.close();
    }

}
