package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10));

        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 9, 10]

        System.out.println("_____________________________________________");

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]

        System.out.println("_____________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers); //[]

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        System.out.println(numbers); //[100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900]

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers); //[100, 200, 300, 100, 200, 300]

        System.out.println("_____________________________________________");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master", "BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles); //[QA, SDET, QA, SDET]

        System.out.println("_____________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10); // true ----> checks one element at a time
        System.out.println("r1 = " + r1);

        boolean r2 = nums.containsAll(Arrays.asList(2,5,10));
        System.out.println("r2 = " + r2); // true -----> checks multiple elements at the same time

        System.out.println("_____________________________________________");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList); //[Josh, Jack, Daniel, Shay, Breanna]

        //ArrayList<String> namesList = new ArrayList<>();
        //namesList.addAll(Arrays.asList(names));

        System.out.println("_____________________________________________");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("_____________________________________________");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
