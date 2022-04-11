package week02;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2022;
        String make = "Volvo";
        String model = "XC60";
        // auto=true  manuel=false
        boolean transmission = true;
        String color = "white";
        int milage = 0;
        int price = 100_000; // euros

        System.out.println(year + " " + make + " " + model + "\ntransmission :" + transmission + " " +
                            "\n" + color + " " + price);

        float priceTL = price * (float) 15.5;

        double taxRate = 1.80;

        double priceAfterTax = priceTL * taxRate;
        System.out.println("priceAfterTax = " + priceAfterTax);


    }

}
