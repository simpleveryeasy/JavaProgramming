package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("test1 started");

        try {
            System.out.println(9/0);
            System.out.println("try block");
        }catch (ArithmeticException e){
            System.out.println("catch block");
            System.out.println("Arithmetic Exception is occurred");
        }

        System.out.println("test2 completed");


        System.out.println("_______________________________");


        System.out.println("test1 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[20]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
            System.out.println("Runtime Exception was occurred");
        }

        System.out.println("test2 completed");
    }
}
