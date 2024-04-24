package Lab23042024;

import java.util.Scanner;
// To find Positive, Negative and Zero value.
public class Assignment_1 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if (num>0)
        {
            System.out.println("Number entered is a Positive");
        } else if (num < 0)
        {
            System.out.println("Number entered is a Negative");
        }
        else
            System.out.println("Number is Zero");

    }
}
