package week06;

import java.util.Scanner;

public class UpperBound {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter upper bound: ");
        int upperBound = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= upperBound ; i++) {

            System.out.print(i+" + ");
            sum+=i;
        }
        System.out.println(" = "+ sum);


    }
}
