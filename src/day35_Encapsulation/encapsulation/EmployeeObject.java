package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jane", 'F', 28, 80000);


        System.out.println(employee1); //Employee{name='Jane', gender=F, age=28, salary=80000.0}

        employee1.setAge(32);
        System.out.println(employee1); //Employee{name='Jane', gender=F, age=32, salary=80000.0}

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);

        employee2.setSalary(employee2.getSalary() + 15000);
        System.out.println(employee2); //Employee{name='Aygun', gender=F, age=31, salary=130000.0}
    }
}
