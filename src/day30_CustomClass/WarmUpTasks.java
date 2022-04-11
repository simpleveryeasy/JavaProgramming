package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {
        
        // swap the first and last elements of an ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0, numbers.size()-1);
        System.out.println("numbers = " + numbers); //numbers = [8, 2, 3, 4, 5, 6, 7, 1]

        System.out.println("_________________________________________________");

        // write a program that moves all the zeros to the end of the ArrayList (1,0,2,0,3,0,4,0) --> (1,2,3,4,0,0,0,0)

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println("list = " + list); //list = [1, 0, 2, 0, 3, 0, 4, 0]

        int size = list.size(); //8

        list.removeAll(Arrays.asList(0));
        System.out.println("list = " + list); //list = [1, 2, 3, 4]

        int newSize = list.size(); //4

        int totalNumberOfZeros = size - newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); // totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("_________________________________________________");
            // same task with using more than one ArrayList

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) {
            if (each != 0) {
                result.add(each);
            }
        }

        System.out.println("result = " + result); //result = [1, 2, 3, 4]

        for (Integer each : list1) {
            if (each == 0){
                result.add(each);
            }
        }

        System.out.println("result = " + result); //result = [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("_________________________________________________");

        /* extract the special chars, digits and letters from a string and store them into separate ArrayLists
        str = "ABCD123$%#@&456EFG!"
        output:
                list1: {1,2,3,4,5,6}
                list2: {A,B,C,D,E,F,G}
                list3: {$,%,#,@,&,!}
         */

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println("chars = " + chars); //chars = [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        ArrayList<Character> letters = new ArrayList<>(chars); // copy all chars to letters ArrayList
        letters.removeIf( p-> !Character.isLetter(p)); // remove the chars that are not letters
        System.out.println("letters = " + letters); //letters = [A, B, C, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println("digits = " + digits); //igits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("specialChar = " + specialChar); //specialChar = [$, %, #, @, &, !]






    }
}
