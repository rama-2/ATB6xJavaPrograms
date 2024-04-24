package Lab23042024;

import java.util.Scanner;
// Program to find Largest of three numbers using If condition.
public class Assignment_2 {
    public static void main(String[] args) {
        System.out.println("Enter number1");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();

        System.out.println("Enter number2");
        int num2 = sc.nextInt();
        System.out.println("Enter number3");
        int num3 = sc.nextInt();

        if((num1>num2) && (num1>num3))
        {
             System.out.println("Number1 is greater -->"+num1);
        }
        else if ((num2>num1)  &&(num2>num3))
        {
                System.out.println("Number2 is greater-->"+num2);
        }
        else
        {
            System.out.println("Number 3 is greater-->" + num3);
        }

sc.close();
    }

}
