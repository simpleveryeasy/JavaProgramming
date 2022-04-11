package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 3, 5, 3, 6, 3};
        int[] result1 = replaceAll(arr1, 3, 300);
        System.out.println(Arrays.toString(result1));

        double[] arr2 = {1.1, 2.1, 3.1, 3.1, 7.1, 3.1, 4.1, 5.1, 6.1};
        double[] result2 = replaceAll(arr2, 3.1, 8.1);
        System.out.println(Arrays.toString(result2));

        char[] arr3 = {'A', 'B', 'C', 'B', 'E', 'B'};
        char[] result3 = replaceAll(arr3, 'B', 'D');
        System.out.println(Arrays.toString(result3));

        String[] arr4 = {"Java", "Python", "C#", "C#", "C#"};
        String[] result4 = replaceAll(arr4, "C#", "C++");
        System.out.println(Arrays.toString(result4));
    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
               array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }
}
