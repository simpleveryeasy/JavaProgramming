package day_39Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Invalid value: " + name);
            System.exit(1);
        }
        this.name = name;
    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Invalid value :" + age);
            System.exit(1);
        }
        this.age = age;
    }



    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')){
            System.err.println("Invalid value :" + gender);
            System.exit(1);
        }
        this.gender = gender;
    }




    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }



    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */
