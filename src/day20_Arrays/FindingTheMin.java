package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingTheMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt();
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(min);
        scan.close();
    }
}
