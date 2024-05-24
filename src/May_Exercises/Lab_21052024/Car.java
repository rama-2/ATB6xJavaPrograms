package May_Exercises.Lab_21052024;

abstract class Car {
    Car(){

    }
    void gearbox(){
        System.out.println("Gearbox is working");
    }
    abstract void drive();
    //This is incomplete in nature.So we use abstract heyword in the class creation.
}
