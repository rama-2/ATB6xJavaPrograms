package Lab_25042024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_001
{
    public static void main(String[] args) {
        System.out.println("Enter Week day");
        Scanner sc = new Scanner(System.in);
        String week = sc.next();
       week = week.toLowerCase();
        //tolowercase -- Converts given string to lowercase.

        switch (week){
            case "monday" : System.out.println("Its Monday");
                break;
            case "tuesday" : System.out.println("Its Tuesday");
                break;
            case "wednesday" : System.out.println("Its Wednesday");
                break;
            case "thursday" : System.out.println("Its Thursday");
                break;
            case "friday" : System.out.println("Its Friday");
                break;
            case "saturday" : System.out.println("Its Saturday");
                break;
            default:
                System.out.println("Its Sunday");

        }

    }
}
