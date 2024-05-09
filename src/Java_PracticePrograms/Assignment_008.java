package Java_PracticePrograms;

import java.util.Scanner;

//Java program to check whether a given input is digit or not using if-else.
public class Assignment_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to check if its digit or not");
        char ch = sc.next().charAt(0);
        if (ch>='0' && ch<='9')
        {
            System.out.println("Its a digit");
        }
        else
        {
            System.out.println("Its not a digit");
        }



    }
}
