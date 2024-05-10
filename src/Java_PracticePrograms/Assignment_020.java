package Java_PracticePrograms;

import java.util.Scanner;

//Java Program to print all odd number between 1 to 100 using while loop.
public class Assignment_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to fetch odd numbers");
        int num = sc.nextInt();

        while(num>0)
        {
            if(num%2!=0){
            System.out.println(num);
            }
            num = num -1;
        }
    }
}
