package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("first name: ");
        String firstName = scan.next();
        System.out.println("second name: ");
        String secondName = scan.next();
        scan.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                                    //c =======> C          +            yDEo =======> ydeo

        secondName = secondName.substring(0, 1).toUpperCase() + secondName.substring(1).toLowerCase();
                                    //s =======> S            +             CHOOL =====> chool

        System.out.println(firstName+" "+secondName);
    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name
		in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */