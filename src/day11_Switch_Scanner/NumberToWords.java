package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number within 0-9: ");

        int number = input.nextInt();

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "zero" : (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ? "three"
                        : (number == 4) ? "four" : (number == 5) ? "five" : (number == 6) ? "six"
                        : (number == 7) ? "seven" : (number == 8) ? "eight" : "nine"
                : "invalid number";

        System.out.println(result);
        input.close();
    }
}
