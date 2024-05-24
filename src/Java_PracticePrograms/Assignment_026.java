package Java_PracticePrograms;


import java.util.Scanner;

//Java program to Swap numbers
public class Assignment_026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("before Swap num1 is " + num1 + " num2 is " +num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap num1 is " + num1 + " num2 is " +num2);

    }
}
