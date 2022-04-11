package week04;

import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter ");
        int carType = input.nextInt();
        boolean isRushHour = false;
        double price = 0.0;

        if (carType == 1) {
            if (isRushHour) {
                price = 30;
            } else {
                price = 15;
            }
            // }else if
        }
    }
}