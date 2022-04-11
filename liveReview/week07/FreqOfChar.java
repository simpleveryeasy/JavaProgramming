package week07;

public class FreqOfChar {

    public static void main(String[] args) {

        String str = "aabbccd";
        String result = "";

        for (int i = 0; i <= str.length()-1; i++){
            char c = str.charAt(i);

            int count = 0;

            for (int j = 0; j <=str.length()-1 ; j++) {
                if (c == str.charAt(j)) {
                    count++;
                }

                if (result.contains(""+c)) {
                    continue;
                }

            }
            result+=c;
            result+=count;

        }
        System.out.println("result :"+result);
    }
}
