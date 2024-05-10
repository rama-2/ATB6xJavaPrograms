package Lab_07052024;

import java.util.Scanner;

public class Lab_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int r_sum = sum(num1,num2);
        int r_sub = sub(num1,num2);
        int r_mul = mul(num1,num2);
        System.out.println(r_sum);
        System.out.println(r_sub);
        System.out.println(r_mul);

    }

    private static int mul(int i, int j) {
        return i*j;
    }

    static int sub(int i, int j) {
        return i-j;
    }

     static int sum(int i, int j) {
        return i+j;
    }

}
