package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;


    public Circle(double radius){
        this.radius = radius;
    }

    static{
        pi = 3.14;
        name = "Circle"; // if variable can be initialized one step it can also be done at declaration

        numbers = new ArrayList<>(); // if it can't, you have put it inside the static bloc to initialize
        numbers.add(10);
        numbers.add(20);
    }

    public static void main(String[] args) {

        System.out.println("pi : " + pi);  //pi : 3.14
        System.out.println("name : " + name);  //name : Circle
        System.out.println("numbers : " + numbers);  //numbers : [10, 20]
    }
}
