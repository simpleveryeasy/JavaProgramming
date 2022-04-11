package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = scan.nextLine();
        scan.close();
        String word2 = "";

        for (int i = 0; i <= word.length()-1 ; i++) {

            if(!word2.contains (""+word.charAt(i))) {
                word2 += word.charAt(i);
            }
        }
        System.out.println(word2);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each character of the string into another String
				  Condition: the character is not contained in the other String, yet before you are adding
 */