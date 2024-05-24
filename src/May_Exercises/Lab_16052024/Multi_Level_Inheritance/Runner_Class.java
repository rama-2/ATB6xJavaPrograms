package May_Exercises.Lab_16052024.Multi_Level_Inheritance;

public class Runner_Class {
    public static void main(String[] args) {

        Grandfather gf = new Grandfather();
        System.out.println("-----------");
        Father father = new Father();
        System.out.println("-----------");
        Child child = new Child();

       // gf.superpower();
        child.superpower();
        //father.printmsg();
        child.printmsg();
    }
}
