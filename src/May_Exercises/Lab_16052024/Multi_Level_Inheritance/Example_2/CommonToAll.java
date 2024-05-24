package May_Exercises.Lab_16052024.Multi_Level_Inheritance.Example_2;

public class CommonToAll {

    CommonToAll()
    {
        System.out.println("DC");
    }
    CommonToAll(String name, int age)
    {
       System.out.println(name+age);
    }
    void OpenSQLConnection(){
        System.out.println("SQL Connection is established!");
    }
}
