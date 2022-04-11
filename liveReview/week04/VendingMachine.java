package week04;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        System.out.println("enter selection and item: ");

        String selection = input.nextLine();
        String item = input.nextLine();


        if (selection.equals("drink")) {
            System.out.println("drink selected");
            if (item.equals("tea")) {

                System.out.println("tea selected");
            }else if (item.equals("coffee")){

                System.out.println("coffee selected");
            }else {
                System.out.println("invalid item");
            }
        }else if (selection.equals("snack")) {
            System.out.println("snack selected");
            if (item.equals("chips")) {

                System.out.println("chips selected");
            }else if (item.equals("candy")) {

                System.out.println("candy selected");
            }else {
                System.out.println("invalid item");
            }
        }else {
            System.out.println("invalid selection");
        }
}
}