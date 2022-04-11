package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};

        int result = frequencyOfElement(arr, 1);
        System.out.println("result = " + result);

        double[] darr = {1.1, 2.1, 3.1, 4.1, 5.1, 1.1, 2.1, 1.1, 3.1};
        int result1 = frequencyOfElement(darr, 1.1);
        System.out.println("result1 = " + result1);
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
            if (each == element){
                count++;
            }
        }
        return count;
    }

}
/*
1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array


 */