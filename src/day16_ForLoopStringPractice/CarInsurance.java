package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {

        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.next();

        System.out.println("Do you have a US driver license?");
        String license = scan.next();
        if (license.equalsIgnoreCase("yes")) {
            premium = 0;
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        if (zip == 20910 || zip == 20740) {
            premium += 60;
        } else if (zip == 22102 || zip == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
            premium += 10;
        } else {
            premium += 20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else {
            premium += 20;

        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium += daysDrivenToWorkOrSchool * 5;

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age < 18) {
            premium *= 20;
        } else if (age < 22) {
            premium *= 6;
        } else if (age < 25) {
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        if (experience <= 0 || age - experience < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            premium -= experience * 5;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += accidentsAmount * (premium * 0.20);
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }
        System.out.println("What is the highest level of education you have completed?");
        scan.nextLine();
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") ||
                education.equalsIgnoreCase("Masters")) {
            premium -= (premium * 0.05);
        } else if (education.equalsIgnoreCase("Doctors")) {
            premium -= (premium * 0.1);
        } else if (education.equalsIgnoreCase("Less than High School")) {
            premium += (premium * 0.05);
        }

        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);

        referenceNumber = name.substring(0, 2).toUpperCase() + age + (name.substring(name.length() - 2).toUpperCase())
                + zip + education.toUpperCase().replace(" ", "");
        System.out.println("Reference number: " + referenceNumber);

        scan.close();

    }
}
/*

Then, ask customer about driving experience. Make sure that experience is greater than 0 and
result of subtraction age from experience is greater or equals to 16.
If no, display message: "Invalid data!" and stop the program. Reduce premium on $5 for every year of experience.

The display message: "Start Your Policy Today For: $premium". Instead of premium, your program should print
premium's variable value. Then display message with reference number: "Reference number: referenceNumber".
In order to build reference number variable (referenceNumber), concatenate first 2 letters of customer's name, age,
last 2 letters of customer's name, zip code, and level of education without spaces.
This value should be all upper case!


Display message: How many years you've been driving?
input from user: 5
input from user: 5
Display message: Have you had any accidents in the last 5 years?
Display message: Have you had any accidents in the last 5 years?
input from user: No
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
input from user: Yes
Display message: What is the highest level of education you have completed?
Display message: What is the highest level of education you have completed?
input from user: PhD
input from user: PhD
Display message: David, here's your quote!
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD
Display message: Reference number: DA25ID20910PHD
 */