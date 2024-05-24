package May_Exercises.Lab_18052024.Super_Keyword_Example;

public class Lab_004 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.display();
        Dog dg1 = new Dog("Lab");
        dg1.display();
        Dog dg2 = new Dog("dodd", "dog",22);
        dg2.display();

    }
}


class  Animal{
    String Type ;
    Animal(){
        System.out.println("DC -Animal");
    }

    Animal(String type){
        this.Type = type;
        System.out.println("PC: "+ type);
    }
}

class Dog extends Animal{
    int a;
    String breed;
    String type;
    Dog(){
        //super("Dog-German Shepard");
        System.out.println("Dog-DC");
    }

    Dog(String breed)
    {
        super("Dog-Streetdog");
        this.breed =breed;
        System.out.println("Dog-PC");
    }

    Dog(String breed, String type)
    {
        this("Dog breed set by Child");
        this.type = type;
        System.out.println("PC with two args");

    }
    Dog(String breed, String type, int a){
        this("Dog breed set by child","Lab");
        this.a = a;
        System.out.println("PC with three Args");
    }

    void display(){
        System.out.println("Breed we have is "+ this.breed + " and dog type is " + this.type);
    }
}