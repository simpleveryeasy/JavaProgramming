package day04_Variables;

public class PrimativesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 168 pounds
        // byte weight = 168; 168 out of byte's range
        short weight = 168; // 168 is within the short's range

        //salary: 100000 $
        //short salary = 100000; out of short's range
        int salary = 100_000; // int is the preferred data type for integer numbers

        //asset: 3_333_333_333
        //int asset = 3_333_333_333; out of the int's range
        long asset = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

       /*
        char gender = 'F';

        char yesNo = 'Y';

        char ch4 = 'AB';
       */

        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);

        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "wooden spoon";
        System.out.println("name = " + name);

        String city = "McLean";
        String state = "Virginia";



    }

}
