package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "small", "white");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move(); // these methods come from Animal class

        dog.bark(); // Dog class own method
        // dog.hunt();  Can not call these two because they belong other classes
        // dog.scratch();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "small", "brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();

        cat.meow();
        cat.scratch();

        // cat.bark();
        // cat.roar();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "large", "orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        // tiger.bark();
        // tiger.meow();
    }
}
