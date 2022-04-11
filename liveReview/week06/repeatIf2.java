package week06;

import java.util.Scanner;

public class repeatIf2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a valid number to find total: ");
        int n = scan.nextInt();
        int sum = 0;
        boolean b = true;


        for (; b; ) {

            System.out.print("numbers: ");

            if (n >= 1) {

                for (int i = 1; i <= n; i++) {

                    System.out.print(" " + i);
                    sum += i;
                }

                b = false;

            } else {
                System.out.println("number is in valid, enter a new number: ");
                n = scan.nextInt();
                b = true;
            }
        }
        System.out.println(" sum: " + sum);
    }
}
