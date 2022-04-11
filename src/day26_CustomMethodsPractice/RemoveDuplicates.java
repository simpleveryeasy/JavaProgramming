package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 1, 4, 2, 5, 5, 3, 6, 7, 8, 7, 9, 3, 2, 4, 3, 1};
        int[] result1 = removeDuplicates(arr1);
        System.out.println(Arrays.toString(result1));

        double[] arr2 = {5.1, 1.1, 4.1, 3.1, 2.1, 3.1, 1.1, 4.1, 2.1, 5.1, 1.1, 6.1};
        double[] result2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(result2));

        char[] arr3 = {'E', 'A', 'D', 'B', 'C', 'B', 'A', 'B', 'C', 'A', 'D', 'E'};
        char[] result3 = removeDuplicates(arr3);
        System.out.println(Arrays.toString(result3));

        String[] arr4 = {"Java", "Python", "C#", "Java", "Python", "Java"};
        String[] result4 = removeDuplicates(arr4);
        System.out.println(Arrays.toString(result4));



    }

    // returns new array with taking only one of the duplicated elements and all non duplicated elements
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if(!ArraysUtility.contains(result, array[i])){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    // returns new array with taking only one of the duplicated elements and all non duplicated elements
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (int i = 0; i < array.length; i++) {
            if(!ArraysUtility.contains(result, array[i])){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    // returns new array with taking only one of the duplicated elements and all non duplicated elements
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (int i = 0; i < array.length; i++) {
            if(!ArraysUtility.contains(result, array[i])){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    // returns new array with taking only one of the duplicated elements and all non duplicated elements
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (int i = 0; i < array.length; i++) {
            if(!ArraysUtility.contains(result, array[i])){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}
