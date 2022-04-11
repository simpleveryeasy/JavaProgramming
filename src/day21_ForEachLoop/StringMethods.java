package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars)); //[J, a, v, a]

        for (char each : chars) {
            System.out.print(each); // Java
        }

        System.out.println("_____________________________");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); //[Wooden, Spoon]

        System.out.println("_____________________________");

        String email = "Woodenspoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr)); // [Woodenspoon, cydeo.com]

        System.out.println("_____________________________");

        String s = "Today is a nice day.Today is monday.Today we learn Java.";

        String[] sentences = s.split("\\.");
        System.out.println(Arrays.toString(sentences)); // [Today is a nice day, Today is monday, Today we learn Java]

    }
}
