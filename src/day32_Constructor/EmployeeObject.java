package day32_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1); //Employee{name='Aaron', gender= , jobTitle='null', salary=0.0}

        Employee employee2 = new Employee("Yuli", 'F');
        System.out.println(employee2); //Employee{name='Yuli', gender=F, jobTitle='null', salary=0.0}

        Employee employee3 = new Employee("Olga", 'F', "SDET");
        System.out.println(employee3); //Employee{name='Olga', gender=F, jobTitle='SDET', salary=0.0}
    }
}
