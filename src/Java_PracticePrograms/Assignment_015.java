package Java_PracticePrograms;

import java.util.Scanner;

//Print all natural numbers in reverse order While loop Java
//Natural numbers are positive umbers that start from 1.
public class Assignment_015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();

        while (num>0)
        {
            System.out.println(num);
            num-- ;
        }
    }

}
