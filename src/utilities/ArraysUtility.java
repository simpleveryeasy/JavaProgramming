package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printElements(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each String of a String array in separate lines
    public static void printElements(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    // prints each Double of a double array in separate lines
    public static void printElements(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of a char array in separate lines
    public static void printElements(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number from the integer array
    public static int maxOfNumbers(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    // returns the maximum number from the double array
    public static double maxOfNumbers(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
    
    // returns the minimum number from the int array
    public static int minOfNumbers(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    // returns the minimum number from the double array
    public static double minOfNumbers(double[] array){
        Arrays.sort(array);
        return array[0];
    }
    
    // checks if the given int number is contained in the given int array, returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){
        boolean result =false;

        for (int each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given double array, returns boolean. contains(Double[], Double)
    public static boolean contains(double[] array, double element){
        boolean result =false;

        for (double each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given char array, returns boolean. contains(char[], char)
    public static boolean contains(char[] array, char element){
        boolean result =false;

        for (char each : array) {
            if (each == element){
                result = true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given String array, returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element){
        boolean result =false;

        for (String each : array) {
            if (each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array,  int element){
        int[] result = new int[array.length+1];

        int i = 0;
        for (int each: array){
            result[i++] = each;
        }
        result[i] = element; // last index
        return result;
    }

    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array,  double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for (double each: array){
            result[i++] = each;
        }
        result[i] = element; // last index
        return result;
    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array,  String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each: array){
            result[i++] = each;
        }
        result[i] = element; // last index
        return result;
    }

    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array,  char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for (char each: array){
            result[i++] = each;
        }
        result[i] = element; // last index
        return result;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // returns the frequency of given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
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
