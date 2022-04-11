package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = replace(arr1, 2, 300);
        System.out.println(Arrays.toString(result1));

        double[] arr2 = {1.1, 2.1, 7.1, 4.1, 5.1, 6.1};
        double[] result2 = replace(arr2, 2, 3.1);
        System.out.println(Arrays.toString(result2));

        char[] arr3 = {'A', 'B', 'C', 'B', 'E'};
        char[] result3 = replace(arr3, 3, 'D');
        System.out.println(Arrays.toString(result3));

        String[] arr4 = {"Java", "Python", "C#"};
        String[] result4 = replace(arr4, 2, "C++");
        System.out.println(Arrays.toString(result4));


    }
    // returns new array with changing the element at the given index
    public static int[] replace(int[] array, int index, int newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // returns new array with changing the element at the given index
    public static double[] replace(double[] array, int index, double newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // returns new array with changing the element at the given index
    public static char[] replace(char[] array, int index, char newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // returns new array with changing the element at the given index
    public static String[] replace(String[] array, int index, String newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}
