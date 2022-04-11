package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;
public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi); //3.14
        System.out.println(Circle.name); //Circle
        System.out.println(Circle.numbers); //[10, 20]

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("______________________________________");

        //find the sum of 10, 20
        int r1 = sum(10, 20);

        //find the sum of 100, 200
        int r2 = sum(100, 200);
    }
}
