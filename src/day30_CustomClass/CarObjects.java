package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car(); //car1 = Car{brand= 'null', model= 'null', color= 'null', year= 0, price= $0.0}
        System.out.println("car1 = " + car1); //car1 = Car{brand=' BMW', model=' X5', color='White', year=20121, price= $35000.0}
        car1.setInfo("BMW", "X5", "White", 2021, 35000);
        System.out.println("car1 = " + car1); //car1 = Car{brand=' BMW', model=' X5', color='White', year=2021, price= $35000.0}

        Car car2 = new Car();
        car2.setInfo("Toyota", "Camry", "White", 2020, 25000);
        System.out.println("car2 = " + car2); //car2 = Car{brand= 'Toyota', model= 'Camry', color= 'White', year= 2020, price= $25000.0

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Blue", 2022, 45000);
        System.out.println("car3 = " + car3);//car3 = Car{brand= 'Audi', model= 'Q7', color= 'Blue', year= 2022, price= $45000.0}

        Car[] cars = {car1, car2, car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));
        System.out.println(carsList);

        for (Car each : carsList) {
            System.out.println(each.brand + " " + each.price);
        }
        /*
        BMW 35000.0
        Toyota 25000.0
        Audi 45000.0
         */

        System.out.println("__________________________________________");

        /*
        recall
        BMW: 2005 - 2008
        Toyota: 1995 - 1997
         */

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equalsIgnoreCase("Toyota") && p.year >= 1995 && p.year <= 2008);








    }
}
