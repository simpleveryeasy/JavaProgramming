package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {
        
        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length ; i++, j++) {
            letters[j]=i;
        }
        System.out.print(Arrays.toString(letters));
        System.out.println();

        for (int i = 0, j = 'A'; i < letters.length ; i++, j++) {
            letters[i] = (char)j ;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println(letters);

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));

        char cha = 'A';
        for (int i = 0; i < letters.length; i++, cha++) {
            letters[i] = cha;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("__________________________________");
        char[] letters2 = new char[26];

        for (char i = 'Z', j = 0; i >= 'A' && j < letters2.length ; i--, j++) {
            letters2[j] = i;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
