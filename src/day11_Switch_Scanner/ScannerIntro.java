package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // scan.nextInt();

        // System.out.println(scan.nextInt());

        System.out.println("enter an integer: ");
        int num1 = scan.nextInt();

        System.out.println("enter a decimal");
        double num2 = scan.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication " + (num1 * num2));

        scan.close();

    }
}
