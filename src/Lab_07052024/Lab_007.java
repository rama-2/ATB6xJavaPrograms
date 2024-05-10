package Lab_07052024;

public class Lab_007 {
    public static void main(String[] args) {
        int result = sum(4,5);
        System.out.println(result);
        int result1 = sum(0,5);
        System.out.println(result1);
        int result2 = sum(4,589);
        System.out.println(result2);
        String str = sum("Rama",10);
        System.out.println(str);
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static String sum(String a, int b)
    {
        return a+b;
    }
}
