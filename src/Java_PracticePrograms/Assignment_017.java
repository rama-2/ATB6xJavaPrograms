package Java_PracticePrograms;
import java.util.Scanner;
//Java Program to count the digits of a given number using while loop.
public class Assignment_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a Number to count the digits");
        int num = sc.nextInt();
        int rem, count = 0;
        while (num>0)
        {
            num=num/10;
            count = count +1;
        }
        System.out.println("The count of digits is "+ count);

    }
}
