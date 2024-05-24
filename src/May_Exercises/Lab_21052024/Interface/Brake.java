package May_Exercises.Lab_21052024.Interface;

public interface Brake {
    void brakefun();


    //We can use default and Static methods in interface.
    default void haltingcar()
    {
        System.out.println("Halt the car");
    }
    static void haltvehicle()
    {
        System.out.println("Halt any Vehicle");
    }
}
