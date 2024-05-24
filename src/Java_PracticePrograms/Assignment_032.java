package Java_PracticePrograms;

import java.util.Scanner;

// Java Program to check if string has vowel using match function
public class Assignment_032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String name = sc.next();
        System.out.println(string_vowel_check(name));
    }

    private static boolean string_vowel_check(String name)
        {
            // ".*[char to check].*" - For reg expression
            return name.toLowerCase().matches(".*[aeiou].*");
        }

}
