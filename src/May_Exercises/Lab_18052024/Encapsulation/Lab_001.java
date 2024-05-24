package May_Exercises.Lab_18052024.Encapsulation;

public class Lab_001 {

    public static void main(String[] args) {
        Bank_Example bb = new Bank_Example("ICICI",100000);
        System.out.println(bb.getBalance());
        System.out.println(bb.getName());
    bb.setName("Axis");
       bb.setBalance(-120);
        System.out.println(bb.getBalance());
        System.out.println(bb.getName());

    }
}
