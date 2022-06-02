package day53_FunctionalInterface;

public class Test {

    public static void main(String[] args) {

        //				2. Create a function that takes a String and returns the reversed value of the given argument
        MyThirdFunctionalInterface<String> stringReverse;

        stringReverse = (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
        };

        System.out.println(stringReverse.method("Java"));

        //				1. Create a function that takes one integer and returns the cube of the given argument

        MyThirdFunctionalInterface<Integer> cube;

        cube = (n) -> {
            Integer nCube = n*n*n;
            return nCube;
        };

        System.out.println(cube.method(3));


    }
}
