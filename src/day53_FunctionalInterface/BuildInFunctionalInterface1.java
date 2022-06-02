package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1);//false

        System.out.println("_______________________________");

        /*
        Predicate<Integer> isEven = p -> {
            return p%2==0;
         };
         */
        Predicate<Integer> isEven = p -> p%2 == 0;

        System.out.println("_______________________________");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        //list.removeIf(p -> {return p%2 ==0;});
        //list.removeIf(p -> p%2 == 0);
        list.removeIf(isEven);

        System.out.println(list);//[1, 3, 5, 7, 1, 3, 5, 7, 1, 3]

        System.out.println("_______________________________");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println(names);//[Java, Python]

        System.out.println("_______________________________");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("_______________________________");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if (each %2 != 0){
                System.out.println(each);
            }
        }
        */

        list2.forEach(p -> System.out.print(p));//123456789

        list2.forEach(p -> {if (p%2 != 0) System.out.print(p);});//13579

        System.out.println("_______________________________");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayiloy"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ")+1) ));

        System.out.println("_______________________________");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("_______________________________");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result [i] = a.get(i);
            }
             return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int[] array = convertToArray.apply(numbers);

        System.out.println("_______________________________");






    }
}
