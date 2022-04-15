package day40_FinalKeyWord;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(dog.getBreed()); //Husky

        dog.drink(); //Max is drinking water


    }
}
