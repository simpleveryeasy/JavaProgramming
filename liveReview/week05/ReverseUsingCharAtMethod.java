package week05;

import java.util.Scanner;

public class ReverseUsingCharAtMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("palindrome: ");
        String palindrome = scan.next();
        scan.close();

        if (palindrome.length() == 5) {
            palindrome = palindrome.replace(palindrome.charAt(0), palindrome.charAt(4));
            palindrome = palindrome.replace(palindrome.charAt(1), palindrome.charAt(3));
            System.out.println(palindrome);
        } else if (palindrome.length() != 5){
            System.out.println("put a 5 char palindrome");
        }
    }
}
