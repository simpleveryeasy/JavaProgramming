package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("first name: ");
        String firstName = scan.next();
        System.out.println("second name: ");
        String secondName = scan.next();
        scan.close();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
                                     //c =======> C          +            yDEo =======> ydeo

        secondName = ("" + secondName.charAt(0)).toUpperCase() + secondName.substring(1).toLowerCase();
                                        //s =======> S            +             CHOOL =====> chool

        System.out.println(firstName+" "+secondName);

    }
}
