package day37_Inheritance.scrumTask;

public class Developer extends Employee{ //Developer IS A Employee, Developer IS A Person


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is fixing bug");
    }
}
/*
4. Create a sub class of EMployee named Developer:

			Add any extra variable or method that Developer object need to have
 */