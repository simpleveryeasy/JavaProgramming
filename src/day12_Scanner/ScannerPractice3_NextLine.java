package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("enter your programming language: ");
        String programming = input.nextLine();

        input.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(programming);



    }
}
