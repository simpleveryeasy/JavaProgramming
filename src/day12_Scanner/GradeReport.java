package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter score: ");
        int sco = input.nextInt();
        input.close();
        String result = "";

        if (sco >= 0 && sco <= 100) {
            if (sco >=90) {
                result = "A";
            }else if (sco >= 80) {
                result = "B";
            }else if (sco >= 70) {
                result = "C";
            }else if (sco >= 60) {
                result = "D";
            }else {
                result = "F";
            }
        }else {
            result = "invalid score";
        }
        System.out.println(result);

    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter his or her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */