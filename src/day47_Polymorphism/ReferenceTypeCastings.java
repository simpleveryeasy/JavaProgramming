package day47_Polymorphism;

import day43_Abstraction.employee.*;
import day44_Abstraction.animal.Animal;
import day44_Abstraction.animal.Cat;
import day44_Abstraction.animal.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Cube;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Shape shape = new Circle(4);//upcasting

        Circle circle1 = new Circle(5);
        Shape shape1 = circle1;

        System.out.println("________________________down casting_________________________");

        Employee employee = new Tester("Mark", 34, 'M', 3454, "QA", 120000);
        ((Tester) employee).bugReport();


        Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        Dog dog = (Dog) animal;

        String name1 = animal.getName();
        System.out.println("name1 = " + name1);
        String name2 = dog.getName();
        System.out.println("name2 = " + name2);

        ((Dog) animal).bark();
        dog.bark();

        Shape shape2 = new Square(5);
        System.out.println(((Square) shape2).getSide());

        System.out.println("________________________________________________________");

        Animal animal1 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");
        //Cat cat = (Cat) animal1;
        //cat.meow();
        ((Cat) animal1).meow();
        //((Dog) animal1).bark(); //ClassCastException

        System.out.println("_______________________________________________________");

        //Driver driver = (Driver) employee; //employee.Tester cannot be cast to employee.driver
        Person person = employee;
        //Teacher teacher = (Teacher) employee; //employee.Tester cannot be cast to employee.Teacher

        System.out.println("_______________________________________________________");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //((Cube)s1).volume(); //Circle cannot be cast to Cube


    }
}
