package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{

        method();
        method1();
        method2();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void method(){
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
        }

    }

    public static void method1() throws FileNotFoundException, InterruptedException {

        //new FileInputStream("");
        Thread.sleep(3000);
    }

    public static void method2() throws FileNotFoundException, InterruptedException{

        method1();
    }

    public static void method3() throws FileNotFoundException, InterruptedException{

        method2();
        Thread.sleep(1000);
    }

    public static void method4() throws FileNotFoundException, InterruptedException{
        method3();
    }
}
