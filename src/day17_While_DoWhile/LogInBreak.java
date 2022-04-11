package day17_While_DoWhile;

import java.util.Scanner;

public class LogInBreak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("username: ");
        String name = scan.nextLine();

        System.out.println("password: ");
        String pass = scan.nextLine();
        int count = 0;

        for (int i = 1; i <= 2; i++) {

            if (name.equals("Cydeo") && pass.equals("Cydeo123")) {
                System.out.println("Logged in");
                break;
            }

            if (i == 2) {
                System.err.println("last attempt!");
            }

            System.err.println("incorrect username or password please re-enter:");

            System.out.println("username: ");
            name = scan.nextLine();

            System.out.println("password: ");
            pass = scan.nextLine();
            count += 1;
        }
        if (!(name.equals("Cydeo") && pass.equals("Cydeo123"))) {
            System.err.println("your account is locked");
        } else {
            System.out.println("Logged in");
        }
        scan.close();
    }
}
