package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReplitTry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();




        if (word.charAt(0) == 'x' || word.charAt(0) == 'X'){
            System.out.println(word.substring(1));
        }else if (word.lastIndexOf('x') == word.length()-1 || word.lastIndexOf('X') == word.length()-1) {
            System.out.println(word.substring(0, word.length()-1));
        }else{
            System.out.println(word);
        }

        scan.close();
    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string
without those 'x' or 'X' chars, otherwise print the string unchanged.
 */