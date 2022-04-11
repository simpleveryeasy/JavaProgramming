package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,4,5,6,7};
        int[] removed1 = removeElement(arr1, 4);
        System.out.println(Arrays.toString(removed1));

    }

    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}
