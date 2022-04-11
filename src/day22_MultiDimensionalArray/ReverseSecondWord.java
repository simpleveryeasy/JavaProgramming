package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [I, Love, Java]

        String reverseSecond = "";

        for (int i = words[1].length()-1; i >= 0; i--) {
            reverseSecond += words[1].charAt(i);
        }
        System.out.println(reverseSecond); // evoL

        // sentence = sentence.replaceFirst(words[1], reverseSecond);

        words[1] = reverseSecond;
        System.out.println(Arrays.toString(words)); // [I, evoL, Java]

        String result = "";
        for (String each : words) {
            result +=each + " ";
        }
        System.out.println(result); // // I evoL Java







    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */