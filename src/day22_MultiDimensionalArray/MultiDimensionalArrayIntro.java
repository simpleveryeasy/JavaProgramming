package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1 = {"Jon", "Joe", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String[][] groups = new String[3][]; // indexes of arrays are 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        // System.out.println(Arrays.toString(groups)); // toString() is only for one dimensional arrays.
        System.out.println(Arrays.deepToString(groups));

        System.out.println("__________________________");

        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };

        int num = arr2D[2][3];
        System.out.println(num); // 11

        int[] nums = arr2D[1];
        System.out.println(Arrays.toString(nums)); // [4, 5, 6, 7]

        String nums2 = "";
        for (int i : nums) {
            nums2+=i+ " ";
        }
        System.out.print(nums2); // 4 5 6 7


    }
}
/*

 */