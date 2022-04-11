package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");

        System.out.println("str = " + str); // str = Java is fun, I love learning Java
        System.out.println("str2 = " + str2); // str2 = Python is fun, I love learning Python

        String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);
        email = email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace(" Python" , "");
        System.out.println("sentence = " + sentence); // sentence = Java Java C# C# C++ C++

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        String s1 = s.replace("Dog" , "Cat");
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        String s2 = "C# is fun, C# is cool";
        String s3 = s2.replace(" C#" , " Java");
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s4 = "Java Mava Lava";
        s4 = s4.replace("a" , "i");
        System.out.println("s4 = " + s4); // s4 = Jivi Mivi Livi

        System.out.println("_____________________________-");

        String s5 = "Java Java Java";
        s5 = s5.replaceFirst("Java" , "Python");
        System.out.println("s5 = " + s5); // s5 = Python Java Java

        String s6 = "C# is fun, C# is cool";
        s6 = s6.replaceFirst("C#" , "Java");
        System.out.println("s6 = " + s6);

        String s7 = "Java";
        s7 = s7.replaceFirst("a" , "i");
        System.out.println("s7 = " + s7);

        s7 = s7.replaceFirst("va" , "vi");
        System.out.println("s7 = " + s7);

    }
}
