package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        /*String name = "Jimmy Joe";
        String buildingNumber = "7025";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "20125";*/

        String name = "Jimmy Joe",
                buildingNumber = "7025",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "20125";



        /*System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +
                ", " + state + " " + zipCode);*/

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city +
                ", " + state + " " + zipCode;


        System.out.println(address);


    }

}

/*
    Create a class called ShippingAddress.java
        Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode
    Use concatenation to print the full address
 */
