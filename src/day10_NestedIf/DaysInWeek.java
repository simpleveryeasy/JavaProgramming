package day10_NestedIf;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a number 1~7: ");
        int n = input.nextInt();

        String day = (n == 1) ? "monday" : (n == 2) ? "tuesday" : (n == 3) ? "wednesday" : (n == 4) ? "thursday"
                     : (n == 5) ? "friday" : (n == 6) ? "saturday" : "sunday";

        System.out.println(day);
        input.close();
    }

}