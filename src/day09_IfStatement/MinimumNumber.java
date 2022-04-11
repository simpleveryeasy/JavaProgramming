package day09_IfStatement;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 different numbers: ");

        int num1 = input.nextInt(),
                num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " is the minimum");
        }else {
            System.out.println(num2 + " is the minimum");
        }
input.close();
    }
}
