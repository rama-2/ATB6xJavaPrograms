package Lab_25042024;


import java.util.Scanner;

/*
Switch is used to match the case, with given list of condition.
Break is mandate to include in each case, otherwise it keep on display following cases.
Default has to be provided .
Switch can only accept int, short, byte, long, enum and string.
If float has to be given, it has to be explicit converted to int.
Boolean is not allowed.
-- Duplicate cases are not allowed.
*/

public class Switch_Operator {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){

            case 10 : System.out.println("Its 10");
                break;

            case 20: System.out.println("Its 20");
            break;

            case 30: System.out.println("Its 30");
                break;
            default:
                System.out.println("OOPS!!");

        }

    }
}
