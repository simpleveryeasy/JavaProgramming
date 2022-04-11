package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

            if (i == 'F') {
                break;
            }
        }

        System.out.println("\n_____________________________________");
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("enter a number: ");
            int num = scan.nextInt();

            if (num < 0) {
                break;
            }
        }
    }
}
