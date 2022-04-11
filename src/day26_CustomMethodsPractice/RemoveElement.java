package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,4,5,6,7};
        int[] removed1 = removeElement(arr1, 4);
        System.out.println(Arrays.toString(removed1));

        double[] arr2 = {1.1, 2.1, 2.1, 3.1, 4.1, 3.1};
        double[] removed2 = removeElement(arr2,1);
        System.out.println(Arrays.toString(removed2));

        String[] arr3 = {"john", "sohn", "sohn", "lohn", "lohn"};
        String[] removed3 = removeElement(arr3,1);
        System.out.println(Arrays.toString(removed3));

        char[] arr4 = {'A', 'B', 'C', 'A', 'B'};
        char[] removed4 = removeElement(arr4,3);
        System.out.println(Arrays.toString(removed4));

    }

    // returns new array with removing element at the given index
    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];


        }
        return result;
    }

    // returns new array with removing element at the given index
    public static double[] removeElement(double[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];


        }
        return result;
    }

    // returns new array with removing element at the given index
    public static char[] removeElement(char[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];


        }
        return result;
    }

    // returns new array with removing element at the given index
    public static String[] removeElement(String[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];


        }
        return result;
    }

}
