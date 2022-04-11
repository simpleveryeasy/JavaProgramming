package week13;

import java.util.Scanner;

public class Password {

    private String password;

    public Password(){

    }

    Scanner scan = new Scanner(System.in);

    public String getPassword() {
       if (password == null) {
           System.out.println("Password is null. Assign a value");
           password = scan.next();
       }else {
           System.out.println("It has a value returning it");
       }
        return password;
    }
}
