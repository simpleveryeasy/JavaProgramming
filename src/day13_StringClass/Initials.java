package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("first name? ");
        String firstName = input.nextLine();

        System.out.println("last name? ");
        String lastName = input.nextLine();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        String initial = first + "." + last;

        System.out.println("initial: " + initial);

        input.close();
    }
}
/*
initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S
 */