package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("full name: ");
        String fullName = input.nextLine();

        System.out.println("GPA: ");
        double gpa = input.nextDouble();


        System.out.println("school name: ");
        String schoolName = input.next();

        input.close();

        System.out.println(age);
        System.out.println(fullName);
        System.out.println(gpa);
        System.out.println(schoolName);


    }
}
/*
age
fullName
 */