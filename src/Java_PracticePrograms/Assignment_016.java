package Java_PracticePrograms;
//Java Program to find the sum of digits of a given number.
import java.util.Scanner;

public class Assignment_016
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int remainder,sum = 0;
            System.out.println("Enter the Number to find Sum: ");
            int number = sc.nextInt();
            while(number>0) {
                remainder = number%10;
                sum=sum+remainder;
                number = number/10;
            }
            System.out.println("Sum of the digits for the number is : " +sum+".");
            sc.close();
        }


}
