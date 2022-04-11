package day09_IfStatement;

import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number within 0-9: ");

        int n = input.nextInt();
        String c;

        if (n >= 0 && n <= 9) {

            if (n == 0) {
                c = "zero";
            } else if (n == 1) {
                c = "one";
            } else if (n == 2) {
                c = "two";
            } else if (n == 3) {
                c = "three";
            } else if (n == 4) {
                c = "four";
            } else if (n == 5) {
                c = "five";
            } else if (n == 6) {
                c = "six";
            } else if (n == 7) {
                c = "seven";
            } else if (n == 8) {
                c = "eight";
            } else {
                c = "nine";
            }

            System.out.println(c);

        } else {
            System.err.println("invalid number");
        }
        input.close();
    }
}
/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

 */