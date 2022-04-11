package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("age: ");
        int age = input.nextInt();

        System.out.println("gender: ");
        String gender = input.next();

        input.nextLine();
        System.out.println("fullName: ");
        String fullName = input.nextLine();

        System.out.println("phoneNumber: ");
        long phoneNumber = input.nextLong();

        System.out.println("zipCode: ");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("schoolName: ");
        String schoolName = input.nextLine();

        System.out.println("cityName: ");
        String cityName = input.nextLine();

        System.out.println("stateName: ");
        String stateName = input.next();

        System.out.println("buildingNumber: ");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("streetName: ");
        String streetName = input.nextLine();

        input.close();

        String address = "\t"+  buildingNumber + " " + streetName + "\n\t" + cityName + ", "
                + stateName + " " + zipCode;

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\n"
                + address + "\n" + schoolName);

    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

    MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name


 */