package Java_PracticePrograms;

import java.util.Scanner;
//Java Program to print String in reverse without using reverse function.
public class Assignment_029 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ENter string");
        String str = sc.next();

        for (int i = str.length()-1; i >=0; i--)
        {

            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
