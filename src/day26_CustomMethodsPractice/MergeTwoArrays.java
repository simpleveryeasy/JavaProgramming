package day26_CustomMethodsPractice;

import java.util.Arrays;

import static utilities.ArraysUtility.addElement;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = {9,7,8,10,6};
        double[] arr4 = {1.1, 2.1, 3.1};
        double[] arr5 = {4.1, 5.1, 6.1};
        char[] arr6 = {'A', 'B', 'C'};
        char[] arr7 = {'D', 'E', 'F'};
        String[] arr8 = {"Java", "Python", "C#"};
        String[] arr9 = {"Pascal", ".Net", "C++"};

        int[] result1 = merge(arr1, arr2);
        System.out.println(Arrays.toString(result1));
        double[] result2 = merge(arr4, arr5);
        System.out.println(Arrays.toString(result2));
        char[] result3 = merge(arr6, arr7);
        System.out.println(Arrays.toString(result3));
        String[] result4 = merge(arr8, arr9);
        System.out.println(Arrays.toString(result4));

    }

    // returns new array with merging two given arrays
    public static int[] merge(int[] firstArray, int[]secondArray){
        int[] result = {};

        for (int each : firstArray) {
            result = addElement(result, each);
        }
        for (int each : secondArray) {
            result = addElement(result, each);
        }
        return result;
    }

    // returns new array with merging two given arrays
    public static double[] merge(double[] firstArray, double[]secondArray){
        double[] result = {};

        for (double each : firstArray) {
            result = addElement(result, each);
        }
        for (double each : secondArray) {
            result = addElement(result, each);
        }
        return result;
    }

    // returns new array with merging two given arrays
    public static char[] merge(char[] firstArray, char[]secondArray){
        char[] result = {};

        for (char each : firstArray) {
            result = addElement(result, each);
        }
        for (char each : secondArray) {
            result = addElement(result, each);
        }
        return result;
    }

    // returns new array with merging two given arrays
    public static String[] merge(String[] firstArray, String[]secondArray){
        String[] result = {};

        for (String each : firstArray) {
            result = addElement(result, each);
        }
        for (String each : secondArray) {
            result = addElement(result, each);
        }
        return result;
    }
}
