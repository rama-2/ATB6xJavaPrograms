package Lab_04052024;

import java.util.Scanner;

//Java program to check, given string is Palindrome or not
public class Lab_008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        StringBuilder str1 = new StringBuilder(str);
        String str2 = str1.reverse().toString();

        if(str.equalsIgnoreCase(str2))
        {
            System.out.println("Its a Palindrome");
        }else
        {
            System.out.println("Its not an Palindrome");
        }
    }
}
