package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 100;

        boolean isDivisibleBy2 = number % 2 == 0;
        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);

        boolean isDivisibleBy3 = number % 3 == 0;
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);

        boolean isDivisibleBy5 = number % 5 == 0;
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);

    }

}
/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

 */