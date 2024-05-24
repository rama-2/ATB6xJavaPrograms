package Java_PracticePrograms;

import java.util.Scanner;

//Java program to write Swap two numbers without using third variable.
public class Assignment_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd num");
        int num2 = sc.nextInt();

        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("After swap "+num1+"and "+num2);

    }
}
