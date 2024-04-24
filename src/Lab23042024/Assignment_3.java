package Lab23042024;

import java.util.Scanner;

//Program to Check if a Character is a Vowel or a Consonant
public class Assignment_3 {
    public static void main(String[] args) {
       char ch = 'I';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Its an Vowel");
        }
        else {
            System.out.println("It's a Consonant");
        }
    }
}
