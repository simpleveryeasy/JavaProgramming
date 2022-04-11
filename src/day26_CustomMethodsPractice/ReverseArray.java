package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result1[] = reverse(arr);
        System.out.println(Arrays.toString(result1));

        double[] arr5 = {4.1, 5.1, 6.1};
        double[] result2 = reverse(arr5);
        System.out.println(Arrays.toString(result2));

        char[] arr6 = {'A', 'B', 'C'};
        char[] result3 = reverse(arr6);
        System.out.println(Arrays.toString(result3));

        String[] arr8 = {"Java", "Python", "C#"};
        String[] result4 = reverse(arr8);
        System.out.println(Arrays.toString(result4));


    }

    // returns new array with reversing given array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // returns new array with reversing given array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // returns new array with reversing given array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // returns new array with reversing given array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
}
