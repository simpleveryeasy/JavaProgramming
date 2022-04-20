package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args) throws InterruptedException{

        System.out.println("Hello");
        sleep(2.5); //throws has to handle
        System.out.println("Hello World");

        System.out.println("----------------------------------------");


        System.out.println("Hello");
        MorningWorkOut.sleep(2.5); // try catch
        System.out.println("Cydeo");

    }


    public static void sleep(double second) throws InterruptedException {


            Thread.sleep( (long) (second * 1000) );

    }
}
