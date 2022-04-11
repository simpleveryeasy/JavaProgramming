package day19_LoopPractices;

public class AllDuplicateChars {

    public static void main(String[] args) {

        String str = "abccdeef";

        for (int i = 0; i < str.length() -1; i++) {
            char ch = str.charAt(i);
            String result = "";
            int count = 0;

            for (int j = 0; j < str.length() - 1; j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    count++;
                }
            }
           if (count >= 2){
               result += ch;
           }
            System.out.print(result);
        }
    }
}
