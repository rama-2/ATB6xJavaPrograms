package Lab_22042024;
// Program to find cube root of a given three numbers.
public class Assignment_2 {
    public static void main(String[] args) {
        double a = 14.2;
        double b = 6.9;
        double c = 12.8;
        double result;
        result = Math.cbrt(Math.sqrt(a)+Math.sqrt(b)- Math.abs(c));
        System.out.println(result);


    }
}