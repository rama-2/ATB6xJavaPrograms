package Java_PracticePrograms;

import java.util.Scanner;

//Print number of days for given month in Java
public class Assignment_025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month to get number of days");
        int num = sc.nextInt();

        switch(num){
            case 1:  System.out.println("Jan has 31 days");
                break;
            case 3:  System.out.println("Mar has 31 days");
                break;
            case 5:  System.out.println("May has 31 days");
                break;
            case 7:  System.out.println("July has 31 days");
                break;
            case 8:  System.out.println("Aug has 31 days");
                break;
            case 10:  System.out.println("Oct has 31 days");
                break;
            case 12:  System.out.println("Dec has 31 days");
                break;
                case 4:  System.out.println("Apr has 30 days");
                break;
            case 6:  System.out.println("June has 30 days");
                break;
                case 9:  System.out.println("Sep has 30 days");
                break;
                case 11:  System.out.println("Nov has 30 days");
                break;
            default:
                System.out.println("Feb has 28 days in Non leap year and 29 days in Leap year");


        }



        sc.close();
    }
}
