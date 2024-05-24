package May_Exercises.Lab_18052024.Super_Keyword_Example;

public class Lab_001 {
    public static void main(String[] args) {
        Car c = new Car();
        int speed = c.maxSpeed;
        c.display();
    }

}

//Car is child class which extends from parent class Vehicle.
//Super keyword is used to access parent variables or methods or constructors.
//this keyword is used to access parent variables or methods or constructors.
class Car extends Vehicle{
    int maxSpeed =180;
    void display(){
        System.out.println("Max speed of the car can be"+super.maxSpeed);
        System.out.println("Max speed of the car "+this.maxSpeed);
    }
}
class Vehicle{
    int maxSpeed  = 100;
void message() {
    System.out.println("This is vehicle class");
}
}