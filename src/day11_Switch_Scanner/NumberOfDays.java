package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number for month");
        int month = input.nextInt();
        System.out.println("enter a number for year");
        int year = input.nextInt();
        String result = "";

        if (month >= 1 && month <= 12) {


            switch (month) {

                case 2:
                    if (year % 4 == 0) {
                        result = "29 days";
                    } else {
                        result = "28 days";
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;

                default:
                    result = "31 days";

            }

        } else {
            result = "invalid number";
        }

        System.out.println(result);

        input.close();
    }
}
