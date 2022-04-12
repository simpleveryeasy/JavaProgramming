package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray",123456);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2021, 65000, "White", 12000);

        toyota.start(); //Toyota Camry is starting with ignition key
        tesla.start(); //Tesla Model S is starting by saying "Start"
        bmw.start(); //BMW X5 is starting with jump start
    }
}
