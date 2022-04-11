package week02;

public class AritmeticOperators {

    public static void main(String[] args) {

        System.out.println("10 / 3 : " + 10 / 3);
        System.out.println("10 / 3.0 : " + 10 / 3.0);
        System.out.println("10 + 3 : " + 10 + 3); // 103 concatenation
        System.out.println("10 + 3 : " + (10 + 3)); // 13

        int num1 = 10;
        double num2 = 3.0;
        int result = (int)(num1 / num2);
        System.out.println("result = " + result);



    }

}
