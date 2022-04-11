package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays1 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] result1 = merge(arr1, arr2);
        System.out.println(Arrays.toString(result1));


    }

    public static int[] merge(int[] firstArray, int[]secondArray){
        int[] result = new int[firstArray.length + secondArray.length];

        int i = 0;

        for (int each : firstArray) {
            result[i++] = each;
        }
        for (int each : secondArray) {
            result[i++] = each;
        }
        return result;
        }
}
