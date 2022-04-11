package day10_NestedIf;

import java.util.Scanner;

public class GradeReport3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter score : ");
        int score = input.nextInt();
        String p = "";

        if (score >= 0 && score <= 100) {

            p = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";
        } else {
            p = "invalid number";
        }

        System.out.println(p);
input.close();

    }

}
