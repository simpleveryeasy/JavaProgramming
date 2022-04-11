package week09;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};

        int indexOne = Arrays.binarySearch(nums,23); // index os 23
        System.out.println(indexOne); // 1

        System.out.println(Arrays.binarySearch(nums, 2344)); // 4

        System.out.println(Arrays.binarySearch(nums, 25)); // -3 if exist what should be the index num+1

        if (Arrays.binarySearch(nums, 12345) >= 0){
            System.out.println("12345 is present in the array"); // 12345 is present in the array
        }else {
            System.out.println("12345 is not in the list");
        }

        int[] numsTwo = {56, 3, -67, 100, 1000, 75}; // to use binarySearch method it is good to sort first

        System.out.println(Arrays.binarySearch(numsTwo, 60)); // -4 even array is not sorted it indexes like sorted

    }
}
