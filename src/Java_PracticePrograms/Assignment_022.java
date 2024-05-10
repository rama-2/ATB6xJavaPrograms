package Java_PracticePrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

//Print all natural numbers from 1 to n using while loop in Java
public class Assignment_022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n in interger");
        int max = sc.nextInt();
     int num = 1;

        while(num>0)
        {
            if(num<=max){
            System.out.println(num);}
            num = num+1;
        }
    }
}
