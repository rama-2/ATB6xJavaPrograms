package Lab_22042024;
//To find the Max number between three given numbers using Ternary operator .
public class Assignment_1 {
    public static void main(String[] args) {
        int num1 = 210;
        int num2 = 3000;
        int num3 = 15009;
        int maxnum;
        int maxnum1;
        maxnum = (num1>num2)?num1:num2;
        maxnum1 = (maxnum>num3)?maxnum:num3;
        System.out.println(maxnum1);
    }
}
