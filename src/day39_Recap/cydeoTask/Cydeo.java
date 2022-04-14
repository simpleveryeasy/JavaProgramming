package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("John", 32, 'M', 232, "Tester", 120000);
        System.out.println(tester);
        //Employee{name='John', age=32, gender=M, employeeId=232, jobTitle='Tester', salary=120000.0}


        Developer developer = new Developer("Jane", 26, 'F', 226,
                "Developer", 130000);
        System.out.println(developer);
        //Employee{name='Jane', age=26, gender=F, employeeId=226, jobTitle='Developer', salary=130000.0}


        Teacher teacher = new Teacher("Arlene", 29, 'F', 229, "Teacher",
                90000);
        System.out.println(teacher);
        //Employee{name='Arlene', age=29, gender=F, employeeId=229, jobTitle='teacher', salary=90000.0}


        Student student = new Student("Willy", 22, 'M', 322, "Java Programming");
        System.out.println(student);
        //Employee{name='Arlene', age=29, gender=F, employeeId=229, jobTitle='teacher', salary=90000.0}

        System.out.println(developer.getAge());//26
        developer.setAge(39);
        System.out.println(developer.getAge());//39


        developer.work(); //Developer Jane is developing the app
        tester.work(); //Tester John is testing the app
        teacher.work(); //Teacher Arlene is teaching


        developer.eat();
        teacher.eat();
        tester.eat();
        student.eat();


    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes

 */
