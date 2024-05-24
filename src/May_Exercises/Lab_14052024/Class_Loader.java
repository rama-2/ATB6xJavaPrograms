package May_Exercises.Lab_14052024;

public class Class_Loader {

    int student_id;
    String name;
    String College_name;
    int branch_code;
    float sem_fee;
    float marks;


    void Class_Loader()
    {
        System.out.println("This is a default constructor");
    }
    void course(){
        System.out.println("Student has taken course for current sem");
    }

    float payment(float sem_fee)
    {
        return (this.sem_fee = sem_fee);
    }
    void result(int student_id,String name,float marks)
    {
        System.out.println("Student name having"+" "+name+" and with ID"+student_id+"got marks"+marks);
    }
}
