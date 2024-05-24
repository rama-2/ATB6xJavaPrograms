package May_Exercises.Lab_18052024.Access_Modifier.COP;

public class Cop {
   //public -- Can be accessed by anyone
   //Private  -- Can be accessed by itself.
    public int gun;
    private String idcard;

    public Cop(int gun)
    {
        this.gun=gun;//PC
    }

    protected void canIshoot(){
        System.out.println("Shoot Out!");
    }
}
