package week01;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        System.out.println("What is " + number1 + " + " + number2 + " = ?");

        int answer = input.nextInt();
        input.close();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
