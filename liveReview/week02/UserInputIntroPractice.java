package week02;

import java.util.Scanner;

public class UserInputIntroPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "";
        System.out.print("enter name:");
        name = input.next();
        System.out.println("name = " + name);

        System.out.print("enter age:");
        int age = input.nextInt();
        System.out.println("age = " + age);

        System.out.print("enter full name:");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("fullName = " + fullName);
    }

}
