package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

    //    Person person = new Person();         can't create an object because it's an abstract class

    //    Employee employee = new Employee();      can't create an object because it's an abstract class

        Tester tester = new Tester("John", 39, 'M', 20101, "QA", 80000);
        Developer developer = new Developer("Mark", 35, 'M', 20015, "Senior", 90000);
        Teacher teacher = new Teacher("Lara", 42, 'F', 20209, "English", 80000);
        Driver driver = new Driver("Joe", 27, 'M', 203012, "Shuttle", 75000);


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();
        System.out.println("____________________________");

        developer.work();
        developer.sleep();
        developer.unitTest();
        developer.eat();
        System.out.println("____________________________");

        teacher.work();
        teacher.sleep();
        teacher.eat();
        System.out.println("____________________________");

        driver.work();
        driver.sleep();
        driver.eat();
        System.out.println("____________________________");
    }
}
