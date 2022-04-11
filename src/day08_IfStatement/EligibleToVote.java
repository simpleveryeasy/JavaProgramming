package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 8;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        if(isEligible){ //True
            System.out.println(name + " is eligible to vote ");
        }


        if (! isEligible){ //! True
            System.out.println(name + " is not eligible to vote ");
        }
    }
}
