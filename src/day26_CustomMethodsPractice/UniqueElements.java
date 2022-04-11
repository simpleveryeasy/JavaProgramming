package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,4,5,3,5,6,7,6};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] darr = {1.1, 2.1, 2.1, 3.1, 4.1, 3.1};
        double[] unique2 = uniqueElements(darr);
        System.out.println(Arrays.toString(unique2));

        String[] sarr = {"john", "sohn", "sohn", "lohn", "lohn"};
        String[] unique3 = uniqueElements(sarr);
        System.out.println(Arrays.toString(unique3));

        char[] carr = {'A', 'B', 'C', 'A', 'B'};
        char[] unique4 = uniqueElements(carr);
        System.out.println(Arrays.toString(unique4));
    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the freq is one, the element is unique
                result = ArraysUtility.addElement(result, each); // assigns every unique element to new array
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the freq is one, the element is unique
                result = ArraysUtility.addElement(result, each); // assigns every unique element to new array
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the freq is one, the element is unique
                result = ArraysUtility.addElement(result, each); // assigns every unique element to new array
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the freq is one, the element is unique
                result = ArraysUtility.addElement(result, each); // assigns every unique element to new array
            }
        }
        return result;
    }


}
