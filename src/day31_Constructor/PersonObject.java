package day31_Constructor;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);
        System.out.println(person1); //Person{name='Daniel', gender=M, age=32}

        Person person2 = new Person("Kseniia", 'f', 28);
        System.out.println(person2); //Person{name='Kseniia', gender=f, age=28}


        Person person3 = new Person("", 'M', 35);
        System.out.println(person3); //Person{name='', gender=M, age=35}
        person3.name = "John";
        System.out.println(person3); //Person{name='John', gender=M, age=35}
    }
}
