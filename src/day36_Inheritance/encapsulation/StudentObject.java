package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("John", 198, 'M', 'A', "HighSchool");
        System.out.println(student1); // Invalid entry: 198
                                     // Student{name='John', age=0, gender=M, grade=A, schoolName='HighSchool'}
        student1.setAge(39);
        System.out.println(student1); //Student{name='John', age=39, gender=M, grade=A, schoolName='HighSchool'}
        System.out.println(student1.getAge()); //39

    }
}
