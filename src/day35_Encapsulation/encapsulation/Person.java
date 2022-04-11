package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age <= 0 || age >= 120){
            System.err.println("Invalid Age: " + age);
            return;
        }
        this.age = age;
    }
}
