package day10_NestedIf;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number for month: ");
        int number = input.nextInt();
        String month = "";

        if (number <= 12 && number >= 1) {
            if (number == 1) {
                month = "January";
            }else if (number == 2) {
                month = "February";
            }else if (number == 3) {
                month = "March";
            }else if (number == 4) {
                month = "April";
            }else if (number == 5) {
                month = "May";
            }else if (number == 6) {
                month = "June";
            }else if (number == 7) {
                month = "July";
            }else if (number == 8) {
                month = "August";
            }else if (number == 9) {
                month = "September";
            }else if (number == 10) {
                month = "October";
            }else if (number == 11) {
                month = "November";
            }else {
                month = "December";
            }
            System.out.println(month);

        }else {
            System.err.println("invalid number");
        }
input.close();
    }

}
