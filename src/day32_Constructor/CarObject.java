package day32_Constructor;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Accord");
        Car car3 = new Car("Lexus", "RX350", 2021);
        Car car4 = new Car("BMW", "X6", 2020, 50000);
        Car car5 = new Car("Tesla", "Model 3", 2019, 70000, "red");

        System.out.println(car1); //Car{make='Toyota', model='null', year=0, price= $0.0, color='null'}
        System.out.println(car2); //Car{make='Honda', model='Accord', year=0, price= $0.0, color='null'}
        System.out.println(car3); //Car{make='Lexus', model='RX350', year=2021, price= $0.0, color='null'}
        System.out.println(car4); //Car{make='BMW', model='X6', year=2020, price= $50000.0, color='null'}
        System.out.println(car5); //Car{make='Tesla', model='Model 3', year=2019, price= $70000.0, color='red'}
    }
}
