package week07;

import java.util.Scanner;

public class ShoppingList2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println(" Enter Item"+count+" and its price:");
            item=scan.nextLine();
            price=scan.nextDouble();
            shoppingListReport+= "Item"+count+": "+item+" Price: "+price+",";
            count++;
            totalPrice+=price;
            System.out.println("Add one more item?");
            scan.nextLine();
            countinue=scan.nextLine();

        }
        while (countinue.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-1));
        System.out.println("Total price: "+totalPrice);



scan.close();
    }

}
/*
output: Enter Item1 and its price:
input: Lemons
input: 2.3
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Oranges
input: 6
output: Add one more item?
input: no
output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
output: Total price: 8.3
 */
