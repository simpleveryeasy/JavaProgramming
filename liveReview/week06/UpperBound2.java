package week06;

import java.util.Scanner;

public class UpperBound2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number to find sum: ");
        int upperBound = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= upperBound; i++) {
            sum += i;

            if (i == upperBound) {
                System.out.print(upperBound + " = " + sum);
                break;
            }
            System.out.print(i + " + ");
        }
    }
}
