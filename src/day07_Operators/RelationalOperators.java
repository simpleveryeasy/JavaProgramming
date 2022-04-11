package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=
        boolean result1 = 200 > 40;
        System.out.println("result1 = " + result1);//true

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);//true

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);//true

        boolean result4 = 300 >= 500;
        System.out.println("result4 = " + result4);//false

        // credit score of at least 720 is require to be eligible for loan
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);//true

        boolean result5 = 100 < 120;
        System.out.println("result5 = " + result5);//true

        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6);//false

        int score = 75;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);//false

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);//true

        System.out.println("________________________________________________");

        int x = 100;
        int y = 200;
        boolean equal = x == y;
        System.out.println("equal = " + equal);//false
        x = 200;
        equal = x == y;
        System.out.println("equal = " + equal);//true

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);//false
        String muhtar = "Muhtar", goodGuy = "Good Guy";
        muhtar = goodGuy;
        result8 = muhtar == goodGuy;
        System.out.println("result8 = " + result8);//true

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);//false

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);//true
        result10 = "Java" == "java";
        System.out.println("result10 = " + result10);//false

        System.out.println("___________________________________");

        boolean result11 = 100 != 200;
        System.out.println("result11 = " + result11);//true

        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);//true

        boolean result13 = 300 != 300;
        System.out.println("result13 = " + result13);//false






    }

}
