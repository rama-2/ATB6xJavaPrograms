package May_Exercises.Lab_21052024.Interface;

public class Car implements Brake,Engine{

    @Override
    public void brakefun() {
        System.out.println("Break applied");
    }

    @Override
    public void engine() {
        System.out.println("Engine is started");
    }
}
