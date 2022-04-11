package day08_IfStatement;

import java.util.Scanner;

public class NameOfTheDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number within 1 to 7 : ");

        int day = input.nextInt();
        input.close();

        boolean day1 = day == 1;
        boolean day2 = day == 2;
        boolean day3 = day == 3;
        boolean day4 = day == 4;
        boolean day5 = day == 5;
        boolean day6 = day == 6;
        boolean day7 = day == 7;

        if (day1) {
            System.out.println("monday");
        }

        if (day2) {
            System.out.println("tuesday");
        }

        if (day3) {
            System.out.println("wednesday");
        }

        if (day4) {
            System.out.println("thursday");
        }

        if (day5) {
            System.out.println("friday");
        }

        if (day6) {
            System.out.println("saturday");
        }

        if (day7) {
            System.out.println("sunday");
        }
    }

}
/*
2. write a program that can display the name of the day

			number = 1 ~ 7

 */