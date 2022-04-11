package day19_LoopPractices;

public class FirstDuplicateChar {

    public static void main(String[] args) {

        String str = "abccdeef";
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
            if (count >= 2) {
                result = "" + ch;
                break;
            }
        }
        System.out.print(result);
    }
}
/*
Write a program that can return the first duplicated character from a string
 */