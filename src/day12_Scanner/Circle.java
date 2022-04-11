package day12_Scanner;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter radius: ");
        double r = scan.nextDouble();
        scan.close();

        double area = r * r * PI;

        double perimeter = 2 * PI * r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
/*
Task:
    1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */