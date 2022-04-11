package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*
        System.out.println("true or false: ");
        boolean result = input.nextBoolean();

         */
        System.out.println("enter your name: ");
        String name = input.next();
        input.close();

        System.out.println("name = " + name);
    }
}
