package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter palindrome:");
        String palindrome = scan.next();
        scan.close();
        String result ="";

        for (int i = palindrome.length()-1; i >= 0 ; i--) {

            result += palindrome.charAt(i);
        }
        System.out.println(result);

        if(palindrome.equalsIgnoreCase(result)) {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
