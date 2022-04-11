package week02;

public class PrimitivesExample {

    public static void main(String[] args) {

        byte num1; // declaring a variable
        num1 = 123; // initializing a variable, assigning a value
        num1 =121; // re-assigning a value

        short num2 = 1234; // declare and initialize at the same line
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000l; // too large for integer
        long distanceShort = 2_000_000_000; //within the int's limit

        float rate = 1000.5f; // have to put f, thinks double
        double dnumber = 123.2;

        System.out.println("______________________type castings____________________-");

        /*
        Narrowing - Explicit - Manually
        Widening - Implicit - Compiler
         */

        num2 =num1; // implicit casting, widening
        System.out.println("num2 = " + num2);

        num2 = (short) distance; // explicit casting, narrowing
        System.out.println("num2 = " + num2);

        short rate2 = (short) rate;
        System.out.println("rate2 = " + rate2);




    }

}
