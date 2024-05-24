package May_Exercises.Lab_18052024.Polymorphism.Method_Overriding;

public class Method_Overriding {
//Same method is available in both Parent and child is Method Overriding.
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();

        Dog D1 = new Hound();
        D1.bark();

    }
}
