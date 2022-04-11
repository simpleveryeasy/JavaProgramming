package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                     19 >= 18 && "UK" == "USA" // false
        //                     14 >= 18 && "USA" == "UK" // false
        //                     18 >= 18 && "USA" == "USA" // true

        System.out.println(name + " is eligible vote: " + isEligible);

        System.out.println("______________________________________");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        boolean isEligibleForLoan = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan " + isEligibleForLoan);

        System.out.println("________________________________");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18 && ('F' == M || 'F' == 'F')
        //                      true     && ( false   || true)
        //                      true     &&  true
        //                      true

        System.out.println(name3 + " is eligible for service " + isEligible3);

        System.out.println("_____________________________");

        String name4 = "James";
        String countryOfBird = "USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBird == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to be US citizen " + isEligible4);

        System.out.println("_________________________");

        String name5 = "Anna";
        double gpa = 2.5;
        int familyIncome = 50000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(name5 + " is eligible for scholarship " + isEligible5);

        System.out.println("_________________________________");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = ! result2;
        System.out.println("result3 = " + result3);

        System.out.println("_________________________________");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = ! passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }

}
