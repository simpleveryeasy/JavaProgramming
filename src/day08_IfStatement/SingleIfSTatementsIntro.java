package day08_IfStatement;

public class SingleIfSTatementsIntro {

    public static void main(String[] args) {

        int number = 101;

        /*System.out.println("Odd number");
        System.out.println("Even number");*/

        boolean evenNumber = number % 2 == 0;

        if(evenNumber){
            System.out.println(number + " is even number");
        }

        if(! evenNumber){
            System.out.println(number + " is odd number");
        }


        System.out.println("________________________________________________");

        int n = 200;


        if (n > 0) {
            System.out.println(n + " is positive ");
        }

        if (n < 0) {
            System.out.println(n + " is negative ");
        }

        if (n == 0) {
            System.out.println(n + " is zero ");
        }
    }
}
