package day09_IfStatement;

public class PassOrFail {

    public static void main(String[] args) {

        int score = 75;

        boolean result = score >= 60;

        if (result) {
            System.out.println("congrats, you passed");
        }else {
            System.out.println("failed");
        }

    }
}
