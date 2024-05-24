package May_Exercises.Lab_18052024.Access_Modifier.COP;

public class JrCop {

    public static void main(String[] args) {
        Cop cop= new Cop(10);
        System.out.println(cop.gun);
      cop.canIshoot();
    }
}
