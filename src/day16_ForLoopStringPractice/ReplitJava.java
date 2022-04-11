package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReplitJava {

    public static void main(String[] args) {

        boolean exists = false;

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();


        int word3 = word.length();


        if (word3 > 3) {
            String word1 = word.substring(0, 4);
            String word2 = word.substring(1, 5);
            String check = "java";
            if (word1.equalsIgnoreCase(check) || word2.equalsIgnoreCase(check)) {
                System.out.println(!exists);
            } else {
                System.out.println(exists);
            }

        } else {
            System.out.println(exists);
        }


    }
}
