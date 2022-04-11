package week04;

import java.util.Scanner;

public class AmazonFreeShipping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter total value: ");
        double totalValue = input.nextDouble();
        String result = "";

        if (totalValue >= 25) {
            result = "free shipping eligible";
        } else {
            result = "not eligible for free shipping";
        }
        System.out.println(result);
    }

}
