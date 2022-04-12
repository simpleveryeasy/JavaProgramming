package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    @Override
    public void start(){
        System.out.println(brand + " " + model + " is starting with ignition key");
    }
}
/*
1. Toyota:
					extra methods:
							reliabile()
 */
