package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printElements(arr1);

        double[] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        ArraysUtility.printElements(arr2);

        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printElements(arr3);

        String[] arr4 = {"Java", "Pyton", "C#", "C++", "PhP"};
        ArraysUtility.printElements(arr4);

        int[] arr5 = {6, 4, 7, 3, 6, 9, 5};
        int maxNumber = ArraysUtility.maxOfNumbers(arr5);
        System.out.println("maxNumber = " + maxNumber);

        double[] arr6 = {3.5, 6.4, 7.8, 9.4, 30.4};
        double maxDoubleNumber = ArraysUtility.maxOfNumbers(arr6);
        System.out.println("maxDoubleNumber = " + maxDoubleNumber);

        double[] arr7 ={9.8, 9.3, 9.6, 9.6, 9.1, 9.4};
        double minDoubleNumber = ArraysUtility.minOfNumbers(arr7);
        System.out.println("minDoubleNumber = " + minDoubleNumber);

        int minNumber = ArraysUtility.minOfNumbers(arr5);
        System.out.println("minNumber = " + minNumber);

        int[] arr8 = {1,2,3,4,5,6,7};
        boolean b1 = ArraysUtility.contains(arr8, 5);
        System.out.println("b1 = " + b1);



    }
}
