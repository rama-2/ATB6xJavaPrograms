package May_Exercises.Lab_18052024.Super_Keyword_Example;

public class Lab_003 {
    public static void main(String[] args) {
        student1 s1 = new student1();
    }
}
//If there is DC in child class, and when we call it,
// then by default parent DC will also be called.

class person1{
    person1(){
        System.out.println("DC");
    }
    person1(String name)
    {
        System.out.println("Param Constructor");
    }
}

class student1 extends person1{
    student1(){
        super("Rama");
        //this("Rama");
        //We cant use both super and this for constructor. one of them can be called at a time.
        System.out.println("Student-DC");
    }

    student1(String a){
        System.out.println("This is child pram");
    }
}
