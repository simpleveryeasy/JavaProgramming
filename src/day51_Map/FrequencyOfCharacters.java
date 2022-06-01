package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(result);


    }
}
