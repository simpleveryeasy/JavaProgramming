package day15_ForLoop;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word: ");
        char firstChar = scan.next().charAt(0);
        scan.close();

        String result = (firstChar >= '0' && firstChar <= '9')? "first char is digit"
                        :(firstChar >= 'a' && firstChar <= 'z')? "first char is lowercase letter"
                        :(firstChar >= 'A' && firstChar <= 'Z')? "first char is uppercase letter"
                        : "first char is special character";

        System.out.println(result);


    }
}
/*
 5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */