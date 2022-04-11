package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class UsefulMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1, 2, 3]
        list.remove(Integer.valueOf(1));
        System.out.println(list); //[2, 3]

        System.out.println("____________________________________________________");
        // array to arrayList
        String[] array = {"red", "yellow", "blue"};
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo); //[red, yellow, blue]

        // arrayList to array
        String[] arrayTwo = new String[listTwo.size()];
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo)); //[red, yellow, blue]

        System.out.println("____________________________________________________");

        Integer[] arrayThree = {1, 2, 3, 4};
        ArrayList<Integer> listThree = new ArrayList<>(Arrays.asList(arrayThree));
        System.out.println(listThree); //[1, 2, 3, 4]

        Integer[] arrayFour = new Integer[listThree.size()];
        listThree.toArray(arrayFour);
        System.out.println(Arrays.toString(arrayFour)); //[1, 2, 3, 4]


    }
}
