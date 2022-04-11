package day09_IfStatement;

import java.util.Scanner;

public class NameOfTheDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day;

        System.out.print("enter a number within 1 to 7 : ");

        day = input.nextInt();
        String theDay;

        boolean day1 = day == 1;
        boolean day2 = day == 2;
        boolean day3 = day == 3;
        boolean day4 = day == 4;
        boolean day5 = day == 5;
        boolean day6 = day == 6;
        boolean day7 = day == 7;

        if (day1) {
            //System.out.println("monday");
            theDay = "monday";
        }else if (day2) {
            //System.out.println("tuesday");
            theDay = "tuesday";
        }else if (day3) {
            //System.out.println("wednesday");
            theDay = "wednesday";
        }else if (day4) {
            //System.out.println("thursday");
            theDay = "thursday";
        }else if (day5) {
            //System.out.println("friday");
            theDay = "friday";
        }else if (day6) {
            //System.out.println("saturday");
            theDay = "saturday";
        }else {
            //System.out.println("sunday");
            theDay = "sunday";

        }
        System.out.print(theDay);
input.close();
    }

}

