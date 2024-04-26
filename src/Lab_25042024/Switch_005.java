package Lab_25042024;

public class Switch_005 {
    public static void main(String[] args) {
        char code = 'B';
        //yield basically returns the value provided.
        // SO here in the below example, for matching case, the yield will retun.

        int val = switch(code){
            case 'A':yield 10;
            case 'B':yield 20;
            case 'C':yield 30;
            default: System.out.println("Hahaha");
            throw new IllegalStateException("Error");
                };

        //Here switch(code) will be replace by Cas B value that is 20.
        // No break condition is required.
        System.out.println(val);
    }
}
