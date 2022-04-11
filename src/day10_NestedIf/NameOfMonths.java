package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = input.nextInt();

        if (n >= 1 && n <= 12) {

            String month = n == 1 ? "january" : n == 2 ? "february" : n == 3 ? "march" : n == 4 ? "april"
                    : n == 5 ? "may" : n == 6 ? "june" : n == 7 ? "july" : (n == 8) ? "august"
                    : (n == 9) ? "september" : (n == 10) ? "october" : (n == 11) ? "november" : "december";
            System.out.println(month);

        }else {
            System.out.println("invalid number");
        }
input.close();
    }
}