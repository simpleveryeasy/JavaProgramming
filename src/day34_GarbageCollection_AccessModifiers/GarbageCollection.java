package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day32_Constructor.Car;
import day33_Statics.Iphone;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        // int n = null;
        String str = null;

        System.out.println(str.toUpperCase());

         */

        String str =  "Wooden Spoon";
        str = null;
        System.out.println(str);

        Car car1 = new Car("Toyota");
        car1 = null;
        System.out.println(car1);

        System.out.println("_____________________________");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";
        System.out.println(dog1);

        String language = "Python";
        language = "java";
        System.out.println(language);

        System.out.println("__________________________________");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;
        System.out.println(list2); //[100]

        list2.addAll(Arrays.asList(200, 300, 400));
        System.out.println(list1); //[100, 200, 300, 400]
        System.out.println(list2); //[100, 200, 300, 400]

        System.out.println(list1 == list2); //true

        System.out.println("___________________________________");

        Student student1 = new Student("Tahir", 'M', 30, 14, 'B');
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1); //Student{name='Ahmet', gender=M, age=30, studentID=14, grade=A}
        System.out.println(student2); //Student{name='Ahmet', gender=M, age=30, studentID=14, grade=A}

        System.out.println("_______________________________");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1); //l1 = [java, Python]
        System.out.println("l2 = " + l2); //l2 = [java, Python]

    }

}
