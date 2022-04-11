package day10_NestedIf;

import java.util.Scanner;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int number = input.nextInt();
        String result = "";

        if (number >= 1 && number <=7) {

            if (number == 1)
                result = "monday";
            else if (number == 2)
                result = "tuesday";
            else if (number == 3)
                result = "wednesday";
            else if (number == 4)
                result = "thursday";
            else if (number == 5)
                result = "friday";
            else if (number == 6)
                result = "saturday";
            else
                result = "sunday";
            System.out.println(result);
        }else
            System.out.println("invalid number");

input.close();
    }
}
