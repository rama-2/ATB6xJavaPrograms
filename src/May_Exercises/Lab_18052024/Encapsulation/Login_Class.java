package May_Exercises.Lab_18052024.Encapsulation;

import java.security.PrivateKey;

public class Login_Class {
    public static void main(String[] args) {
        vwologin v1 = new vwologin("admin","admin123");
        String username = v1.getUsername();
        String password = v1.getPassword(false);
        System.out.println(password);
    }
}
//Private variables are used.
//We use getter setter to access constructors.

class vwologin
{
   private String username;
   private String password;

   vwologin(String username, String password)
   {
       this.username=username;
       this.password=password;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if (isAuth) {
            return password;
        }
        else {
            return "Not allowed";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
