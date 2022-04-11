package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("enter a math operator: ");
        char op = scan.next().charAt(0);
        if (!(op == '+' || op == '-')) {
            System.err.println("invalid math operator: " + op);
            System.exit(0);
        }

        System.out.println("enter second number: ");
        int num2 = scan.nextInt();

        if (op == '-'){
            System.out.println(num1 - num2);
        }else
            System.out.println(num1 + num2);

scan.close();
    }
}
