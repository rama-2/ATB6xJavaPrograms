package May_Exercises.Lab_18052024.Encapsulation;

public class Bank_Example {
    //variables
    private String name;
    private int balance;

    //constructors
    Bank_Example(){
        System.out.println("Print Bank details");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>0)
        {
            this.balance = balance;
        }
        else {
            System.out.println("Not allowed");
        }

    }

    Bank_Example(String name, int balance){
        this.name = name;
        this.balance = balance;

    }
}
