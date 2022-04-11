package day10_NestedIf;

import java.util.Scanner;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter grade: ");
        int g = input.nextInt();

        String result = (g >= 0 && g <= 100)? (g > 60)? "passed" : "failed" : "invalid number";

        System.out.println(result);

input.close();

    }
}
