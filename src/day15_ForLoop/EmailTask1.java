package day15_ForLoop;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter email: ");
        String email = scan.next();
        scan.close();

        if (email.indexOf("_") > -1) {
            String firstPart = email.substring(0, email.indexOf("_"));
            String secondPart = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String rest = email.substring(email.indexOf("@"));
            email = secondPart + "_" + firstPart + rest;
        }
        System.out.println(email);
    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */