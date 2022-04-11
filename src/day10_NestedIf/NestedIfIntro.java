package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("invalid number");
        }

        System.out.println("_________________________________");

        int age = 25;
        boolean hasId = true;

        if (hasId) {

            if(age >= 21) {
                System.out.println("eligible to buy alcohol");
            }else {
                System.out.println("not eligible to buy alcohol");
            }

        }else {
            System.out.println("you must have an ID to buy alcohol");
        }
        System.out.println("________________________________");

        int number = 25;

        if (number >= 1 && number <= 7) {

            if (number == 1) {
                System.out.println("monday");
            }else if (number == 2) {
                System.out.println("tuesday");
            }else if (number == 3) {
                System.out.println("wednesday");
            }else if (number == 4) {
                System.out.println("thursday");
            }else if (number == 5) {
                System.out.println("friday");
            }else if (number == 6) {
                System.out.println("saturday");
            }else {
                System.out.println("sunday");
            }
        }else {
            System.out.println("invalid number");
        }

    }
}
