package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee{ //Scrum Master IS A Employee, Scrum Master IS A Person


    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Scrum Master", salary, companyName);
    }

    public void arrangeMeeting(){
        System.out.println(jobTitle + " " + name + " is arranging");
    }
}
/*
7. Create a sub class of EMployee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have
 */
