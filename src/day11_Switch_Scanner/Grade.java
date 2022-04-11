package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter grade char: ");
        char grade = input.next().charAt(0);
        String result = "";

        switch (grade) {

            case 'A':
                result = ("excellent");
                break;

            case 'B':
                result = ("great job");
                break;

            case 'C':
                result = ("good");
                break;

            case 'D':
                result = ("passed");
                break;

            case 'F':
                result = ("failed");
                break;

            default:
                result = ("invalid grade");

        }
        System.out.println(result);

        input.close();


    }
}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */