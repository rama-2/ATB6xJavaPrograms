package Lab_25042024;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        System.out.println("Enter num1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter which operation to perform:+, -, *, /,%");
        char symbol = sc.next().charAt(0);

        int result=  switch (symbol)
        {
            case '+': yield (num1+num2);
            case '-': yield (num1-num2);
            case '*': yield (num1*num2);
            case '/': yield (num1/num2);
            case '%': yield (num1%num2);

            default: System.out.println("Please enter valid one");
            throw new IllegalStateException("Error");

        };
        System.out.println(result);
        sc.close();
    }
}
