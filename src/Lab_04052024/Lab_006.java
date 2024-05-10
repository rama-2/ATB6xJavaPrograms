package Lab_04052024;
// String Append
public class Lab_006 {

    public static void main(String[] args) {

        StringBuffer happy= new StringBuffer("Devi");
        String sb = happy.append("Rama").toString();
        System.out.println("happy");

        StringBuilder happy1 = new StringBuilder("Rama");
        String st = happy1.append("Devi").toString();
        System.out.println("happy1");
    }
}
