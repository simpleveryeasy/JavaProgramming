package day09_IfStatement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter 2 numbers to calculate: ");
        double num1 = input.nextInt();
        double num2 = input.nextInt();

        System.out.print("enter a math operator: ");
        char op = input.next().charAt(0);

        double res;

        if (op == '+') {
            res = num1 + num2;
            if (op == '-') {
                res = num1 - num2;
            }else if (op == '*') {
                res = num1 * num2;
            }else if (op == '/') {
                res = num1 / num2;}

            System.out.println("result is: " + res);
        }else {
            System.err.println("invalid operator");
        }
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