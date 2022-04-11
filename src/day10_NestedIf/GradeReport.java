package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

       /*
        System.out.println(true == ! false); //true
        System.out.println(! true != false); //false
        System.out.println(! false == true); //true
        System.out.println(! ! false); //false
        System.out.println(! ! ! true); //false

        */

        Scanner input = new Scanner(System.in);

        System.out.println("enter score : ");
        int score = input.nextInt();
        String p = "";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                p = "Excellent";

            } else if (score >= 80) {
                p = "Great";

            } else if (score >= 70) {
                p = "Good";

            } else if (score >= 60) {
                p = "Passed";

            } else {
                p = "Failed";
            }


        } else {
            System.err.println("invalid number");
        }

        System.out.println(p);
input.close();

    }

}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */