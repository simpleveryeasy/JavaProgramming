package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // remove elements less than 5
        list.removeIf(p -> p < 5); //Lambda expression

        System.out.println(list); //[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println("_____________________________________________");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each % 2 == 0);
        System.out.println(list2); //[1, 3, 5, 7, 9]

        System.out.println("_____________________________________________");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Pyton", "JavaScript", "C#", "C++", "Java", "Java"));
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3); //[Pyton, C#, C++]

        System.out.println("_____________________________________________");

        ArrayList<String> names = new ArrayList<>(); //remove only not palindrome names
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));
        names.removeIf(name -> !StringUtility.isPalindrome(name));
        System.out.println(names); // [Anna, Racecar, Level, Eye]







    }
}
