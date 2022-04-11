package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26];

        char ch = 'Z';
        for (int i = 0; i < alphabet.length ; i++, ch--) {
            alphabet[i] = ch;
        }
        System.out.println(alphabet[0]);

        System.out.println(Arrays.toString(alphabet));
    }
}
