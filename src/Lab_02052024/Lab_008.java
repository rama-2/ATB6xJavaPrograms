package Lab_02052024;
//FizzBuzz Problem:
// Write a program o print numbers from 1 to 100.
//For multiples of 3 and 5, print Fizzbuzz.
//For multiples of 3, Print Fizz
//For multiples of 5, Print Buzz
// FOr others, just print number.


public class Lab_008 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <=100 ; i++)
        {
            if((num%3==0)&&(num%5==0))
            {
                System.out.println("FizzBuzz");
            }
            else if (num%3==0)
            {
                System.out.println("Fizz");
            }
            else if (num%5==0)
            {
            System.out.println("Buzz");
            }
            else
            {
            System.out.println(i);
            }
            num = num+1;
        }
    }
}
