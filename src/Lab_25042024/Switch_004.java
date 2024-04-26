package Lab_25042024;

public class Switch_004 {
    public static void main(String[] args) {
        int itemcode = 004;
        switch (itemcode){
            case 001 -> System.out.println("Its a laptop");
            case 002 -> System.out.println("Its a desktop");
            case 003,004 -> System.out.println("Its a MAC");
            default -> System.out.println("Default....!!!!");
        }
        char ch = 'z';
        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("Its a vowel");
            case 'A','E','I','O','U'-> System.out.println("Its a Vowel");
            default -> System.out.println("Its a consonant");
        }
    }
}
