package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store elements : 10 20 50 70

        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));

        System.out.println("_____________________");

        //create a variable that stores 5 scores
        int[] scores = new int[5];
        scores[1] = 85; // assign 85 to second score
        scores[scores.length - 1] = 95;
        scores[0] = 65;
        scores[2] = 55;
        scores[3] = 75;

        System.out.println(Arrays.toString(scores)); // [65, 85, 55, 75, 95]

        System.out.println("__________________________________");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " \n");
        }
        System.out.println("___________________________________");

        for (int i = months.length - 1; i >= 0 ; i--) {
            System.out.print(months[i]);
        }


    }
}
