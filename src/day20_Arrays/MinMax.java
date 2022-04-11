package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number: ");
            numbers[i] = scan.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        System.out.println(min);
        scan.close();
    }
}
