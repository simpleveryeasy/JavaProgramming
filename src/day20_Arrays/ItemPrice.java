package day20_Arrays;

import java.util.Scanner;

public class ItemPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];

        double total = 0;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter item name: ");
            items[i] = scan.nextLine();
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter price: ");
            prices[i] = scan.nextDouble();
            total+=prices[i];
        }
        System.out.println(total);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "--" + "$" + prices[i]);
        }
        scan.close();
    }
}
/*
            1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

 */