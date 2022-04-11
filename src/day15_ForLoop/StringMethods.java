package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty(); // false
        System.out.println(r);

        boolean r1 = str.isBlank(); // true
        System.out.println(r1);

        String str2 = "Cydeo";
        System.out.println(str2.isBlank()); // false

        System.out.println("_____________________");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println("yEs".equals("Yes")); // false
        System.out.println("yEs".equalsIgnoreCase("Yes")); // true

        System.out.println("_________________________________________");

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#"); // false
        boolean hasJava = sentence.contains("Java"); // true
        boolean hasJava2 = sentence.contains("java"); // false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); // true

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("__________________________________________");

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.contains(input2)); //true
        System.out.println(input1.toLowerCase().contains("java")); // true


        System.out.println("__________________________________________");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo"); //true

        boolean y = a.endsWith("Spoon"); // true

        boolean z = a.toLowerCase().startsWith("wooden"); //true

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
































    }
}
