package Java_PracticePrograms;
//Java Program to Check If a Number is Neon Number or Not

import java.util.Scanner;

// 9*9 =81 -->8+1 =9
public class Assignment_033 {
    public static void main(String[] args) {
        int num;
    int a;
    int b;
    int result;
    int temp;


    for(num=0;num<100;num++)
    {
        result = num*num;
        a=result%10;
        b=result/10;
        temp=a+b;
        if (num == temp) {
            System.out.println("Its a neon number"+num);
        }
    }

    }
}
