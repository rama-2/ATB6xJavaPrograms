package May_Exercises.Lab_16052024.Multi_Level_Inheritance;

public class Dynamic_Dispatch {
    public static void main(String[] args) {

        Grandfather G1 = new Father();
        Grandfather G2 = new Child();
        //Dynamic Dispatch -- New objects can be created based on the Parent Class.
        //Here Grandfather is parent reference for father, also for child.

        //But we cannot access Parent class object using Child class like below.
        //Father f1 = new Grandfather();
        //Child c1 = new Father();
    }
}
