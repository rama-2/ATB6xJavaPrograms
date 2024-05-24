package May_Exercises.Lab_18052024.Super_Keyword_Example;

public class Lab_002
{
    public static void main(String[] args) {
        Student s = new Student();
        s.message();//this will display Student
        s.display();//this will display both Parent and child
    }
}

class Person{
    void message(){
        System.out.println("Im person message");
    }
}

class Student extends Person{
    void message(){
        System.out.println("Im a Student message");
    }
    void display(){
        this.message();
        super.message();
    }
}