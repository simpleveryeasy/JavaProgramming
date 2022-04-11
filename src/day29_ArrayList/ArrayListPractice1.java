package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countryNames = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada" };

        //converting Array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countryNames));

        list.removeIf(p -> p.length() >= 10);

        //converting ArrayList to Array
        countryNames = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countryNames)); //[Japan, Korea, Turkey, Canada]





    }
}

/*
create an ArrayList of country names
remove all the country names that have more than 10 chars
 */