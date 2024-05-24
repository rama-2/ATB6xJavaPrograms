package Java_PracticePrograms;

import java.util.Scanner;

public class Assignment_031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for Vowel");
        String name = sc.next();
        int namelen = name.length();

        for (int i = namelen-1 ; i >= 0; i--)
        {
            char ch = name.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(ch + " is vowel in given string");

            }
        }

    }
}
