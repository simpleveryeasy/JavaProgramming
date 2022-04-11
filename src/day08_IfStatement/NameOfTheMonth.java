package day08_IfStatement;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number within 1 to 12 : ");

        int month = input.nextInt();
        input.close();

        boolean january = month == 1;
        boolean february = month == 2;
        boolean march = month == 3;
        boolean april = month == 4;
        boolean may = month == 5;
        boolean june = month == 6;
        boolean july = month == 7;
        boolean august = month == 8;
        boolean september = month == 9;
        boolean october = month == 10;
        boolean november = month == 11;
        boolean december = month == 12;

        if (january) {
            System.out.println("january");
        }
        if (february) {
            System.out.println("february");
        }
        if (march) {
            System.out.println("march");
        }
        if (april) {
            System.out.println("april");
        }
        if (may) {
            System.out.println("may");
        }
        if (june) {
            System.out.println("june");
        }
        if (july) {
            System.out.println("july");
        }
        if (august) {
            System.out.println("august");
        }
        if (september) {
            System.out.println("september");
        }
        if (october) {
            System.out.println("october");
        }
        if (november) {
            System.out.println("november");
        }
        if (december) {
            System.out.println("december");
        }

    }
}
/*
1. write a program that can display the name of the month

			number = 1 ~ 12
 */