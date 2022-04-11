package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        char tenthChar = word.charAt(4);
        System.out.println("tenthChar = " + tenthChar);

        System.out.println("__________________________________________");

        String batch = "Batch 25 is the best batch";
        int totalChars = batch.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = batch.charAt(batch.length() - 1);
        System.out.println("lastChar = " + lastChar);

        lastChar = batch.charAt(totalChars - 1);
        System.out.println("lastChar = " + lastChar);

        char sixthChar = batch.charAt(5);
        System.out.println("sixthChar = " + sixthChar);

        System.out.println("________________________________-");

        String name = "wooden spoon";
        String upperName = name.toUpperCase();
        System.out.println("name = " + name);
        System.out.println("upperName = " + upperName);
    }
}
