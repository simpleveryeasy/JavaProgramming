package day19_LoopPractices;

public class IndexOfFirstUnique {

    public static void main(String[] args) {

        String str = "aabccdeef";
        int result = 0;

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
                result = str.indexOf(ch);
                break;
            }
        }
        System.out.print(result);
    }
}
