package Java_PracticePrograms;

import java.util.Scanner;

//Java Program to check whether a triangle is equilateral, isosceles or scalene triangle
public class Assignment_024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side1");
        int side1 = sc.nextInt();
        System.out.println("Enter Side2");
        int side2 = sc.nextInt();
        System.out.println("Enter Side3");
        int side3 = sc.nextInt();

        if((side1==side2)&&(side1==side3)&&(side2==side3))
        {
            System.out.println("Its an Equilateral Triangle");
        } else if (((side1==side2)&& (side2!=side3)&&(side1!=side3))||
        ((side1==side3)&&(side1!=side2)&&(side2!=side3))||((side2==side3)&&(side1!=side2)&&(side1!=side3)))
        {
            System.out.println("Its an Isosceles Trinagle");
        }
        else
        {
            System.out.println("Its an Scalene Triangle");
        }

        sc.close();
    }
}
