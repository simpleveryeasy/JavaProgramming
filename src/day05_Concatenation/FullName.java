package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println(firstName + " " + lastName);
        System.out.println(fullName);

        // Full name of the person is _____
        System.out.println("Full name of the person is " + fullName);

        // ____ is ____ years old.
        System.out.println(fullName + " is " + age + " years old." );

        // ____ is _____, works at ______
        System.out.println(fullName + " is " + jobTitle + ", " + "works at " + companyName);

        // fullName is jobTitle, works at companyName, and fullName' salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", " + "works at " + companyName + " and " +
                fullName + "'s " + "salary is $" + salary);


    }

}
