package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public static void printbrandAndmadeIn(){
        System.out.println(brand + " : " + madeIn);
    }

    public void printOS(){
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }
}
