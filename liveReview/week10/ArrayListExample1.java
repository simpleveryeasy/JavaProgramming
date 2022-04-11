package week10;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9
            // We can put primitives to the ArrayList with the help of autoboxing
           arr.add(i);
        }

    }
}
