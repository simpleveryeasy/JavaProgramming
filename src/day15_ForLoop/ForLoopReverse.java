package day15_ForLoop;

import java.util.Scanner;

public class ForLoopReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word to reverse:");
        String word = scan.next();
        String result = "";
        scan.close();

        for (int i = 1; i <= word.length(); i++) {


            result += word.charAt(word.length()-i);


        }
        System.out.println(result);


    }
}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */