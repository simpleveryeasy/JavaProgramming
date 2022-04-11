package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', 2, "small", "white");
        System.out.println(dog1); //Animal{name='Alex', breed='Husky', gender=M, age=2, size='small', color='white'}
        dog1.bark(); //Alex is barking
        dog1.eat(); //Alex is eating

        Cat cat1 = new Cat("Love", "Siamese", 'F', 4, "large", "black");
        System.out.println(cat1); //Animal{name='Love', breed='Siamese', gender=F, age=4, size='large', color='black'}
        cat1.scratch(); //Love is scratching
        cat1.drink(); //Love is drinking

        Parrot parrot1 = new Parrot("King", "Macav", 'M', 3, "small","blue");
        System.out.println(parrot1); //Animal{name='King', breed='Macav', gender=M, age=3, size='small', color='blue'}
        parrot1.sing(); //King is singing
        parrot1.move(); //King is moving

    }
}
