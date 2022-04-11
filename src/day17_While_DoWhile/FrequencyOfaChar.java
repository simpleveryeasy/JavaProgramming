package day17_While_DoWhile;

public class FrequencyOfaChar {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';
        int count = 0;

        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i) == ch) {
                count++;
            }

        }
        System.out.println(count);
    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */