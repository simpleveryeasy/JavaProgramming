package day21_ForEachLoop;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3 = new int[arr1.length + arr2.length];


        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }



        for (int each : arr2) {
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
