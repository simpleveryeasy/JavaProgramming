package day15_ForLoop;

import java.util.Scanner;

public class ReplaceXOrX {

    public static void main(String[] args) {

        System.out.println("enter a word: ");
        String word = new Scanner(System.in).next(); //xcodeX

        word = word.replace("x", "a").replace("X", "a"); //acodea

        System.out.println(word);
    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */