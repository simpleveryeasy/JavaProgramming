package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        //function1: create a function display chars of a string
        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");

        //function3: create a function display the cube of a number
        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);

        cube.test(3);



    }
}
