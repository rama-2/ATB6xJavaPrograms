package Java_PracticePrograms;

import java.util.Scanner;
//Java Program to print even numbers between 1 to 100 using while loop
public class Assignment_021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to fetch even numbers");
        int num = sc.nextInt();

        while(num>0)
        {
            if(num%2==0){
                System.out.println(num);
            }
            num = num -1;
        }
    }
}
