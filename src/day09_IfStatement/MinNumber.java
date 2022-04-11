package day09_IfStatement;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean minN1 = n1 < n2;
        boolean minN2 = n1 > n2;
        boolean equal = ! minN1 && ! minN2;

        if (minN1) {
            System.out.println(n1 + " is the minimum number");
        }
        if (minN2) {
            System.out.println(n2 + " is  the minimum number");
        }
        if (equal) {
            System.out.println(n1 + " and " + n2 + " are equal");
        }

    }
}
/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number

 */