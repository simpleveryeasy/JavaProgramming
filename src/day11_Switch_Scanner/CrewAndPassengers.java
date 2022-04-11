package day11_Switch_Scanner;

import java.util.Scanner;

public class CrewAndPassengers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number of people: ");
        int number = input.nextInt();

        String result = "";

        if (number == 50 || number == 75 || number == 100) {

            result = (number == 50) ? "20 crew, 30 passengers" : (number == 75) ? "25 crew, 50 passengers"
                    : "30 crew, 70 passengers";

        } else {
            result = "invalid number";
        }

        System.out.println(result);

        input.close();

    }
}
/*
2. Create a class called CrewAndPassengers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */