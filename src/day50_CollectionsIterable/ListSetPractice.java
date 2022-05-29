package day50_CollectionsIterable;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set.size() = " + set.size());//set.size() = 5
        System.out.println("set = " + set);//set = [1, 2, 3, 4, 5]

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println("array = " + Arrays.toString(array));//array = [1, 2, 3, 4, 5]
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array));
        System.out.println("list1 = " + list1);//list1 = [1, 2, 3, 4, 5]

        List<Integer> list = new ArrayList<>(set);
        System.out.println("list = " + list);//list = [1, 2, 3, 4, 5]

        /*
        List<String> names = null;
        names.size();//NullPointerException
        Set<String> set1 = new TreeSet<>(names);//NullPointerException
         */

        System.out.println("___________________________________________");

        //pop() ===> LIFO

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        ( (Stack)chars).pop();
        System.out.println("chars = " + chars);//chars = [A, B, C]

        Stack<Character> chars2 = new Stack<>();
        chars2.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        chars2.pop();
        System.out.println("chars2 = " + chars2);//chars2 = [A, B, C]

        System.out.println("___________________________________________");

        //poll() ===> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        ((LinkedList<String>) names).poll();
        System.out.println("names = " + names);//names = [Jimmy, Kathy, Breanna, Max]



    }
}
