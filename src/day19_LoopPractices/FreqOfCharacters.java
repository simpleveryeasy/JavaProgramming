package day19_LoopPractices;

public class FreqOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";


        for (char i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (char j = 0; j <= str.length() - 1; j++) {

                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                }

            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.print(result);

    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */