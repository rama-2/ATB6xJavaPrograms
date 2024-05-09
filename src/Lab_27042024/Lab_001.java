package Lab_27042024;

public class Lab_001 {

    public static void main(String[] args) {
        int num1=45;
        int num2=55;
        int num3=122;

        int result;
        int result1;
        int result2;
        result1 = (num1>=num3)? num1 :num3;
        result2 = (num2>=num3)? num2 :num3;
        result = (num1>=num2)? result1 : result2;
        System.out.println(result);

    }
}
