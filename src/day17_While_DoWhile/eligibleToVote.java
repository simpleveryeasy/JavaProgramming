package day17_While_DoWhile;

import java.util.Scanner;

public class eligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = scan.nextInt();

        while (!(age <= 120 && age >= 1)){
            System.err.println("invalid age reenter: ");
            age = scan.nextInt();
        }
        System.out.println("are you a US citizen? yes/no: ");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("invalid entry, please re-enter \"yes or no\":");
            answer = scan.next();
        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")){
            System.out.println("you're eligible to vote");
        }else {
            System.out.println("you're not eligible to vote");
        }
        scan.close();
    }
}
