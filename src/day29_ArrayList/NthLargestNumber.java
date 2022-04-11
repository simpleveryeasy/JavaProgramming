package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8,8));

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);
        System.out.println("max = " + max); // 6

    }
}
/* find the nth largest number
                 {1,2,3,4,5,6,6,7,8,8}
                 n = 3

                 output = 4

 */