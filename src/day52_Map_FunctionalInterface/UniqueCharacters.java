package day52_Map_FunctionalInterface;

import java.util.*;

import static java.util.Collections.frequency;

public class UniqueCharacters {

    public static void main(String[] args) {

        //1. Write a program that can find the unique characters from a String
        //
        //			Ex:	str = "aabcccdeeeef";
        //
        //			output: 	{b=1, d=1, f=1}

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = frequency(Arrays.asList(arr), each);
            if (frequency == 1){
                result.put(each, frequency);
            }
        }
        System.out.println(result); //{b=1, d=1, f=1}


        //Write a program that can find the character that has the highest frequency in a String
        //        Note: Must use a map
        //
        //        Ex:
        //            str = "eeeeeaaabbbbccccdd"
        //
        //        Output:
        //            {e=5, a=3, b=4, c=4, d=2 }
        //            character e has the highest frequency

        String str2 = "eeeeeaaabbbbccccdd";

        String[] arr2 = str2.split("");

        Map<String, Integer> result2 = new TreeMap<>();

        for (String each : arr2) {
            result2.put(each, frequency(Arrays.asList(arr2), each));
        }

        System.out.println(result2);


        //Write a program that can find the element that has the highest frequency in an arrayList
        //	        Note: Must use a map
        //
        //	        Ex:
        //	            list: [java, java, python, c#]
        //
        //	        output:
        //	            [java=2, python=1, c#=1]
        //	            element java has the highest frequency

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> result3 = new TreeMap<>();

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            result3.put(each, frequency);

        }
        System.out.println(result3);


    }
}
