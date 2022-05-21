package week19;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        //Set does not allow duplicates: this help you to implement some algorithms

        String str = "zzzzzoooooxxxxxaaaaabbbbbccccdddddeeeeee";
        List<String> listOne = new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println("listOne = " + listOne);//listOne = [a, a, a, a, a, b, b, b, b, b, c, c, c, c, d, d, d, d, d, e, e, e, e, e, e]

        Set<String> stringSet = new LinkedHashSet<>();//to keep my insertion order
        stringSet.addAll(listOne);//duplicates removed
        System.out.println("stringSet = " + stringSet);//stringSet = [a, b, c, d, e]
        stringSet.add(null);
        System.out.println("stringSet = " + stringSet);//stringSet = [a, b, c, d, e, null]

        Set<String>linkedHashSet = new HashSet<>();//if we don't need order
        linkedHashSet.addAll(listOne);
        System.out.println("linkedHashSet = " + linkedHashSet);//stringSet1 = [a, b, c, d, e]
        linkedHashSet.add("g");
        linkedHashSet.add(null);
        System.out.println("linkedHashSet = " + linkedHashSet);//stringSet1 = [null, a, b, c, d, e, g]
        
        Set<String>treeSet = new TreeSet<>();//orders the list alphabetical
        treeSet.addAll(listOne);
        System.out.println("treeSet = " + treeSet);


    }
}
