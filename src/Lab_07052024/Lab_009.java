package Lab_07052024;

public class Lab_009 {
    public static void main(String[] args) {
        //Non Return with no Paramter
        hello();
        //Non Return with Parameter
        hello1("Rama");
        //Return with no Parameter
        sumofTwo(3,4);
        //Return with Parameter
        int num = sumoftwo(23,4);
        System.out.println(num);
    }
    static void hello(){
        System.out.println("Non Return with no Paramter");
    }
    static void hello1(String name)
    {
        System.out.println("Non Return with Parameter");
    }
    static void sumofTwo(int a, int b)
    {
        System.out.println(a+b);
    }
    static int sumoftwo(int a,int b)
    {
        return a+b;
    }
}
