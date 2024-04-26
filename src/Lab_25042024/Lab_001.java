package Lab_25042024;

import java.util.Scanner;

public class Lab_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter Age");
        float sal = sc.nextFloat();

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My sal is "+sal);

sc.close();
    }
}
