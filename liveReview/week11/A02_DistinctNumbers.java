package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    // take numbers from user and add to arraylist if distinct

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (user input if zero ends)");

        int value;
        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0) { //if value is not already contained and not 0
                list.add(value);
            }

        }while (value != 0);
        input.close();

        for (Integer numbers : list){
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println("size of arraylist is " + list.size());

        Collections.sort(list);
            System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }
}
