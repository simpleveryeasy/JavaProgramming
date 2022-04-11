package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        System.out.println("________________________________-");

        String result1 = (n % 2 == 0) ? "even" : "odd";

        System.out.println(result1);

        System.out.println("_____________________________________");

        int age = 17;

        String result2 = (age <= 21) ? "not eligible" : "eligible";
        System.out.println(result2);

        System.out.println("______________________________________");

        int number = 100;

        String result3 = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(result3);
    }
}
