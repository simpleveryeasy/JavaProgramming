package week08;

public class ArrayLoopWithConditions {

    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        for (double eachPrice : prices) {
            System.out.println("each price is : " + eachPrice);
        }
        System.out.println("________________________________");

        for (double price : prices) {
            if (price > 100.0) {
                System.out.println("price more than 100: " + price);
            }
        }

        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.println("price between 10 to 70: " + price);
            }
        }

        int count = 0;
        for (double price : prices) {
            if (price > 50) {
                count++;
            }
        }
        System.out.println("count of prices more than 50: " + count);


    }

}
