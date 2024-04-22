package Lab_18042024;

public class Lab003 {

    public static void main(String[] args) {
         byte a = 5;
         byte b= 10;
         //When we try to add both Byte variables, it will automatically convert to interger.
        int c;
        c = a+b;
        System.out.println(c);

        byte x= 5;
        byte y=8;
        byte z;
        z = (byte)(x+y);
        //Explicit casting from integer to byte.
        System.out.println(z);

        float x1 = 9.0f;
        float y1 = 15.7f;
        double z1;
        z1 = (double)(x1+y1);
        System.out.println(z1);



    }
}
