package week08;

public class ShoppingAppTest {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        System.out.println("find the first index of 'Gloves' in items array");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Gloves found at index: " + i);
               // System.exit(0); gets out from main method
                break; // just to get out of loop
            }
        }

        System.out.println("___________set a boolean variable true if 'ipad' exits in the items");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }

        }
        if (iPadExists)
            System.out.println("We have iPad in the list");
        else
            System.out.println("ipad not found");

        System.out.println("______find if the Jacket in the list, if found give all the details ");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                String itemDetail = items[i] + " -$" + prices[i] + " #" + itemIDs;
                System.out.println("itemDetail = " + itemDetail);
                break;
            }

        }



    }
}
