package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("full name: ");
        String fullName = input.nextLine();

        System.out.println("building number");
        String buildingNumber = input.next();

        input.nextLine();
        System.out.println("street name: ");
        String streetName = input.nextLine();

        System.out.println("city name: ");
        String cityName = input.nextLine();

        System.out.println("state: ");
        String state = input.next();

        System.out.println("zip code: ");
        String zipCode = input.next();

        input.close();

        String shippingAddress = fullName + "\n" + buildingNumber + " " + streetName +  "\n" +
                cityName + " " + state + "\n" + zipCode;
        System.out.println("shippingAddress =\n" + shippingAddress);

    }
}
/*
fullName
buildingNumber
streetName
cityName
state
zipCode
 */