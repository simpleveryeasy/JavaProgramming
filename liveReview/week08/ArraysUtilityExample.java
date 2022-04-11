package week08;

import java.util.Arrays;

public class ArraysUtilityExample {

    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 1000, 35};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int[] numsTwo = {4, 5, 10, 35, 1000};

        System.out.println("Arrays.equals(nums,numsTwo) = " + Arrays.equals(nums,numsTwo));
        System.out.println(nums == numsTwo); // false

        int [] numsThree = nums;
        System.out.println(nums == numsThree); // true
        System.out.println(Arrays.equals(nums,numsThree)); // true

        int[] numsFour = Arrays.copyOf(nums,nums.length);
        nums[0] = 5000;
        System.out.println(Arrays.toString(numsThree)); // numsThree created with '=' so nums[0] affect it
        System.out.println(Arrays.toString(numsFour)); // numsFour created with 'copyOf' so nums[0] doesn't affect it



    }
}
