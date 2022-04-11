package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{ //Product Owner IS A Employee, Product Owner IS A Person


    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Product Owner", salary, companyName);
    }

    public void gatherRequirements(){
        System.out.println(jobTitle + " " + name + " is meeting user");
    }
}
/*
6. Create a sub class of EMployee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have
 */
