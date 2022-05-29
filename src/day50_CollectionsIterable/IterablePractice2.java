package day50_CollectionsIterable;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove all the names "ahmed"


        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println("names = " + names);//names = [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("________________________________________");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for (Iterator<String> it2 = names2.iterator(); it2.hasNext(); ) {
            if (it2.next().equalsIgnoreCase("ahmed")) {
                it2.remove();
            }
        }
        System.out.println("names2 = " + names2);//names2 = [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("________________________________________");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));
        System.out.println("names3 = " + names3); //names3 = [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("-------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 90, 89, 79, 50));

        Iterator<Integer> it3 = set.iterator();
        while (it3.hasNext()){
            if (it3.next() %2 == 0){
                it3.remove();
            }
        }
        System.out.println("set = " + set);//set = [1, 2, 3, 4, 100, 5, 6, 7, 8, 9, 79, 50, 89, 90]


    }
}
