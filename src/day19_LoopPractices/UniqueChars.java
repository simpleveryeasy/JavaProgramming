package day19_LoopPractices;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";


        for (int i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length() - 1; j++) {

                char each = str.charAt(j);
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }
        System.out.print(result);


    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */