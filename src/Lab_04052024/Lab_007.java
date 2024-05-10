package Lab_04052024;

import java.util.Scanner;

//String Reverse
public class Lab_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String str_1 = sc.next();
        StringBuilder str_2 = new StringBuilder(str_1);
        String str_rev = str_2.reverse().toString();
        System.out.println(str_rev);
    }
}
