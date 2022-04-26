package day43_Abstraction.car;

import day43_Abstraction.car.Car;

public final class Honda extends Car { //make it final to cut the inheritance , it can't be parent class

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    public void start(){
        System.out.println("Twist the key to ignition");
    }


}
