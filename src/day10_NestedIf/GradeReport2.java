package day10_NestedIf;

import java.util.Scanner;

public class GradeReport2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter score : ");
        int score = input.nextInt();

        String p = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                 : (score >= 60) ? "Passed" : "Failed" : "invalid number";
        System.out.println(p);
input.close();
    }
}

