package May_Exercises.Lab_16052024.Multi_Level_Inheritance.Example_2;

public class Runner_Class {
    public static void main(String[] args) {
        Test tst = new Test();
        tst.excelandSQL();
        CommonToAll cta = new Test();
        cta.OpenSQLConnection();
        CommonToAll ct = new CommonToAll("Rama",25);
    }
}
