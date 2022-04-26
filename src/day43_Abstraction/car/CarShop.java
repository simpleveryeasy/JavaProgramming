package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

    //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000); Can not create object from Abstract class


        Car car1 = new Honda("Accord", "White", 2019, 30000);

        Honda honda = new Honda("Accord", "White", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2021, 60000);

        Tesla tesla = new Tesla("Model 13", "Red", 2021, 60000);

        System.out.println(car1);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Blue");


        honda.setPrice(25000);
        audi.setPrice(30000);
        tesla.setPrice(40000);
    }
}
