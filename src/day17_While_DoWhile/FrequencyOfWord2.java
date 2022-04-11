package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String word2 = scan.nextLine();
        int end = word.length()- word2.length();
        int count = 0;

        for (int i = 0; i <= end; i++) {
            String str = word.substring(i, i+word2.length());

            if (str.equalsIgnoreCase(word2)){
                count++;
            }

        }
        System.out.println(count);
        scan.close();
    }
}
