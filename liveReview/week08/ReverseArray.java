package week08;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 1000};
        System.out.println("Before reversing : " + Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i]; // 5
            nums[i] = nums[nums.length-1 -i];
            nums[nums.length-1 -i] = temp;
        }
        System.out.println("After reversing : " + Arrays.toString(nums));
    }
}
