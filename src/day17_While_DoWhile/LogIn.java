package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("username: ");
        String name = scan.nextLine();

        System.out.println("password: ");
        String pass = scan.nextLine();


        if (name.equals("Cydeo") && pass.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempt = 3;

            while ((!(name.equals("Cydeo") && pass.equals("Cydeo123"))) && attempt >= 1) {
                if(attempt == 1){
                    System.err.println("this is your last chance:");
                }
                System.err.println("invalid username or password please re-enter:");

                System.out.println("username: ");
                name = scan.nextLine();

                System.out.println("password: ");
                pass = scan.nextLine();

                attempt--;
            }
            if (name.equals("Cydeo") && pass.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.err.println("your account is locked");
            }

        }

scan.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter
                correct credentials and if all three attempts are failed, then print "Your account is locked."

 */