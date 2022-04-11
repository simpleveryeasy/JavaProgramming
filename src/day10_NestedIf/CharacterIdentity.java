package day10_NestedIf;

import java.util.Scanner;

public class CharacterIdentity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a char: ");

        char ch = input.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        }else if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("alphabetic");
        }else {
            System.out.println("special character");
        }
        input.close();
    }
}

/*

4. Create a class called Character Identity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */