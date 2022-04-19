package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

        System.out.println("test1 completed");


        System.out.println("_______________________________");


        System.out.println("test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[20]);
            System.out.println("try block");
        }catch (RuntimeException e){
            e.printStackTrace(); //preferred method
            //System.out.println(e.getMessage()); Index 20 out of bounds for length 5
        }

        System.out.println("test2 completed");


        System.out.println("_______________________________");


        System.out.println("test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        System.out.println("test3 completed");



        System.out.println("_______________________________");


        System.out.println("test4 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test4 completed");


        System.out.println("_______________________________");


        System.out.println("test5 started");


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("test5 completed");
    }
}
