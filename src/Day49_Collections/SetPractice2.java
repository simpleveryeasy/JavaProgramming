package Day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

/*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1);//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        arr = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
*/

        //arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
       // System.out.println(Arrays.toString(arr));//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); //[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20,10));

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);//[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]

        String[] array = {"A", "A", "B", "C"};
        Set<String> set5 = new LinkedHashSet<>();
        set5.addAll(Arrays.asList(array));

        System.out.println("_______________________________________");
        //return the fifth element after removing duplicates
        Integer[] nums = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("_______________________________________");
        String str = "aaaabbbbccccdddeeeee";


        String result = ""; //a4b4c4d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each + count;
        }

        System.out.println(result);//a4b4c4d3e5

        System.out.println("_______________________________________");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Brenna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);//James

        System.out.println(new ArrayList<>(names).get(4));//Shay

        for (String eachName : names){
            System.out.println(eachName);//[Ahmet, John,James,Brenna,Shay]
        }


    }


}
