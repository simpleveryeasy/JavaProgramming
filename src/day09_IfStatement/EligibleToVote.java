package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        if(isEligible){ //True
            System.out.println(name + " is eligible to vote ");
        } else {
            System.out.println(name + " is not eligible to vote ");
        }

    }
}
