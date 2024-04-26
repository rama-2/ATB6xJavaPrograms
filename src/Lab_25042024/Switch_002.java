package Lab_25042024;

import java.util.Scanner;

public class Switch_002 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a' : System.out.println("Its an vowel");
            break;
            case 'A' : System.out.println("Its an vowel");
                break;
            case 'e' : System.out.println("Its an vowel");
                break;
            case 'E' : System.out.println("Its an vowel");
                break;
            case 'i' : System.out.println("Its an vowel");
                break;
            case 'I' : System.out.println("Its an vowel");
                break;
            case 'o' : System.out.println("Its an vowel");
                break;
            case 'O' : System.out.println("Its an vowel");
                break;
                case 'u' : System.out.println("Its an vowel");
                break;
                case 'U' : System.out.println("Its an vowel");
                break;
            default:
                System.out.println("Its a consonant");

            sc.close();


        }
    }
}
