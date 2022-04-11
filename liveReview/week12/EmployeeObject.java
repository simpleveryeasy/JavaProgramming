package week12;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee[] testers = {
                new Employee("Yasin", "SDET", 123, 150000),
                new Employee("Erol", "QA Lead", 101, 170000),
                new Employee("Rumeysa", "QA Engineer", 232, 120000),
                new Employee("Dilek", "SDET", 134, 155000)
        };


        // find max salary
        double maxSalary = Double.MIN_VALUE;
        for (Employee each : testers) {

            System.out.println(each);

            if (each.salary > maxSalary){
                maxSalary = each.salary;
            }
        }

        System.out.println(maxSalary);
    }
}
