package day37_Inheritance.scrumTask;

public class Tester extends Employee{ //Tester IS A Employee, Tester IS A Person

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
}
/*
. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */
