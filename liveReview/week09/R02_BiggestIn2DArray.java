package week09;

import java.util.Arrays;

public class R02_BiggestIn2DArray {

    public static void main(String[] args) {

        // find the biggest number in each array and store in to another array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };

        System.out.println(Arrays.deepToString(arr)); // [[3, 12, 3, 34, 12], [13, 7, 456, 34, 3], [-5, -24, -2, -10, -4]]

        int[] biggestNumbers = new int[arr.length]; // length = 3

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];

            for (int each : arr[i]) {
                if (each > max){
                    max =each;
                }
            }
            biggestNumbers[i] = max;
        }
        System.out.println(Arrays.toString(biggestNumbers)); // [34, 456, -2]
    }
}
