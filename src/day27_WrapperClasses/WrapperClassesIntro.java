package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // autoboxing

        int num2 = n1; // unboxing

        System.out.println("________________________________");

        Integer integerValue = 100;

        long longValue = integerValue;

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("__________________________________");

        int num3 = 200;
        // Long l3 = num3; can not be done
        // Double d3 = num3; can not be done
        Integer n3 = num3; // only wraps same data type --------- autoboxing

        System.out.println("__________________________________");

        Integer z = 900;
        Integer y = z;

        System.out.println("__________________________________");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};

        System.out.println("__________________________________");







    }

}
