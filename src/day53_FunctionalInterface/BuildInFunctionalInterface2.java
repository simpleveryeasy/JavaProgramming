package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //create a function check given int is contained in array of int, returns boolean

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b){
                    result = true;
                    break;
                }
            }

            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("_________________________________");

        //create a function that check if two strings are anagram
        //a = bac,  b = cab
        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("_________________________________");

        //create a function to print a string for given number of times
        BiConsumer<String, Integer> printTimes = (a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        printTimes.accept("Java", 3);

        System.out.println("_________________________________");

        //create a function takes first and last names and prints formatted full name
        BiConsumer<String, String> fullName = (a, b) -> {
            a = a.toLowerCase();
            a = a.substring(0,1).toUpperCase()+a.substring(1);

            b = b.toLowerCase();
            b = b.substring(0,1).toUpperCase()+b.substring(1);

            System.out.println(a + " " + b);
        };

        fullName.accept("jAVa", "lanGUaGe");

        System.out.println("_________________________________");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("_________________________________");

        //create a function takes two integers and returns maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a,b) ->  (a>b)?a:b;

        int max = maxNum.apply(100, 200);
        System.out.println(max);

        System.out.println("_________________________________");

        //create a function take two integer arrays into a list
        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) result.add(each);
            for (int each : y) result.add(each);

            return  result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1, arr2);
        System.out.println(nums);

        System.out.println("_________________________________");

        //create a function that takes a list of String and list of Integer and put into a map
        // names = {"Josh", "Daniel"}
        // scores = {100, 110}
        //map = {Josh = 100, Daniel = 110}

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (j, k) -> {
            Map<String, Integer> result = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                result.put(j.get(i), k.get(i));

            }
            return result;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Josh", "Daniel"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(100, 110));

        Map<String, Integer> students = merge2.apply(names, scores);
        System.out.println(students);//{Josh=100, Daniel=110}

    }
}
