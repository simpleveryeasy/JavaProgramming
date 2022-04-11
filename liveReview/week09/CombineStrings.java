package week09;

public class CombineStrings {

    public static void main(String[] args) {

        /*
     *
     * * Write a method/function that will take two String and combine them
    Ex:
        Input: "java", "apple"
        Output: "jaapvpale"

        // jaapvpale

     */

        System.out.println(mergeString("java", "apple"));
        String str = mergeString("java", "fun");
        System.out.println(str);

    }

    public static String mergeString(String str1, String str2){

        String merged = "";
        int biggerStr = str1.length()>str2.length()? str1.length() : str2.length();

        for (int i = 0; i < biggerStr; i++) {
            if (i < str1.length()) {
                merged += str1.charAt(i);
            }
            if (i < str2.length()){
                merged+= str2.charAt(i);
            }
        }


       return merged;
    }


}
