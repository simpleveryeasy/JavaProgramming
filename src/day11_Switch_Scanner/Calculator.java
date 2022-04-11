package day11_Switch_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter 2 numbers to calculate: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("enter a math operator: ");
        char op = input.next().charAt(0);

        double res = 0;

        if (op == '+' || op == '-' || op == '/' || op == '*') {
            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                default:
                    res = num1 / num2;
            }

        } else {
            System.err.println("invalid operator");
        }
        System.out.println("result is: " + res);

        input.close();
    }
}

/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */