package day18_NestedLoop;

import java.util.Scanner;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);


        int num1 = 20;

        int num2 = 6;

        int count = 0;


        while (num1 >= num2) {
            num1-=num2;
            count++;
        }
        System.out.println(num1);
        System.out.println(count);
    }
}
/*
1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication)
		and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;
 */