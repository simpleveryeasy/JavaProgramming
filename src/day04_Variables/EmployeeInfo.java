package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "John Doe";
        int age = 34;
        char gender = 'M';
        String company = "Cydeo";
        String jobTitle =  "Programmer";
        double yearsOfExperience = 3.5;
        int salary = 100_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "1234-5678-90";
        String SSN = "(123)- 45-6789";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);

        int sum = 5;
        sum = sum + 1;
        System.out.println("sum = " + sum);


    }

}

/*
Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
 */