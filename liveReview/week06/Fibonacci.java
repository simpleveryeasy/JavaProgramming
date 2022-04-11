package week06;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int num1 = 0, num2 = 1;
        int sum = 0;

        String series = "";

        for (int i = 0; i <= n; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            series += sum+" ";
        }
        System.out.println("series = "+series);
        System.out.println("final number in the sequence is "+num2);
    }
}
