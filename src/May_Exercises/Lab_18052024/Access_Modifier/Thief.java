package May_Exercises.Lab_18052024.Access_Modifier;

import May_Exercises.Lab_18052024.Access_Modifier.COP.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        cop.gun=50;
        System.out.println(cop.gun);

    }
}
