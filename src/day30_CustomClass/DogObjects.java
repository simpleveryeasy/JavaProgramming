package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        System.out.println("______________________________________");

        Dog dog4 = new Dog();
        dog4.setInfo("Bright", "Coli", 4, 'F', "Large", "Brown");
        Dog dog5 = new Dog();
        dog5.setInfo("Bullet", "Pitbull", 3, 'M', "Small", "Black");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');
        System.out.println(femaleDogs);

        ArrayList<Dog> dogsList = new ArrayList<>(Arrays.asList(dogs));
        for (Dog each : dogsList) {
            if (each.gender == 'M'){
                maleDogs.add(each);
            }
        }

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);



    }


}
