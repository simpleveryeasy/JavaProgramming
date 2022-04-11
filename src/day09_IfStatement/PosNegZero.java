package day09_IfStatement;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");

        int n = input.nextInt();


        if (n > 0) {
            System.out.println("positive");
        }else if (n < 0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
input.close();
    }
}
