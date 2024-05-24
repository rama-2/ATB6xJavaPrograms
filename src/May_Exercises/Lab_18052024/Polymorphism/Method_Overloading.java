package May_Exercises.Lab_18052024.Polymorphism;

public class Method_Overloading {

    Method_Overloading(){
        System.out.println("Its a DC");
    }
    void Gift(String S){
        System.out.println("Message ->" + S);
            }
            int Gift(int x)
            {
                System.out.println("ENtered number is "+x);
                return x;
            }
            float Gift(float f)
            {
                System.out.println("Entered number is "+f);
                return f;
            }

    public static void main(String[] args) {
        Method_Overloading mo = new Method_Overloading();
        mo.Gift(10);

    }
}
