package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter grade char: ");
        char grade = input.next().charAt(0);
        String result = "";

        switch (grade) {

            case 'A': case 'B': case 'C': case 'D':
                result = "passed";
                break;

            case 'F':
                result = "failed";
                break;

            default:
                result = "invalid";

        }
        System.out.println(result);

        input.close();

    }
}
/*
if A,B,C,D passed
otherwise failed
 */