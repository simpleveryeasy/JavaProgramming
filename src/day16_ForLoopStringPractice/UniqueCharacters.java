package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = scan.nextLine();
        scan.close();
        String result = "";

        for (int i = 0; i <=  word.length()-1; i++) {

            if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */