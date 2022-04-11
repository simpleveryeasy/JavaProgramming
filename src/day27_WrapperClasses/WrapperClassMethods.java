package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str1 = "123";

        int num = Integer.parseInt(str1); // int

        System.out.println(num + 1);
        System.out.println(str1 + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);

        int num3 = Integer.MAX_VALUE;
        int num4 = Integer.MIN_VALUE;
        System.out.println("int max " + num3);
        System.out.println("int min " + num4);

        long num5 = Long.MAX_VALUE;
        long num6 = Long.MIN_VALUE;
        System.out.println("long max " + num5);
        System.out.println("long min " + num6);

        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println("b1 = " + b1);

        System.out.println("____________________________");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); // returns Integer wrapper class
        int y = Integer.valueOf(s2); // you can unbox Integer wrapper class to int
        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double.valueOf(s3);
        System.out.println(s3);

        System.out.println("___________________________________");

        // isDigit()
        char ch1 = '0';
        boolean b2 = Character.isDigit(ch1);
        System.out.println(b2);

        // isLetter()
        char ch2 = 'A';
        boolean b3 = Character.isLetter(ch2);
        System.out.println(b3);

        char ch3 = '$';
        boolean b4 = !Character.isLetterOrDigit(ch3);
        System.out.println(b4);

        // upperCase
        boolean b5 = Character.isUpperCase(ch2);
        System.out.println(b5);

        boolean b6 = Character.isLowerCase(ch2);
        System.out.println(b6);

        System.out.println("_________________________________");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)){
                sum+= Integer.parseInt("" + each);
            }
        }
        System.out.println("sum is: " + sum);


    }


}
