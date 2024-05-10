package Java_PracticePrograms;

import java.util.Scanner;

//Java Program to check Person is valid for vote or not
public class Assignment_023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to verify");
        int age = sc.nextInt();

        if (age>=18)
        {
            System.out.println("Person is eligible to vote");
        }
        else
        {
            System.out.println("Person is not eligible to vote");
        }
      sc.close();
    }
}
