package Day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(hashSet);//[200, 40, 10, 90, 300]
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(hashSet);//[200, 40, 10, 90, 300]
        hashSet.addAll(Arrays.asList(null, null, null));
        System.out.println(hashSet);//[null, 200, 40, 10, 90, 300]


        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(linkedHashSet);//[10, 200, 300, 40, 90]
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(linkedHashSet);//[10, 200, 300, 40, 90]
        linkedHashSet.addAll(Arrays.asList(null, null, null));
        System.out.println(linkedHashSet);//[10, 200, 300, 40, 90, null]


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(treeSet);//[10, 40, 90, 200, 300]
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(treeSet);//[10, 40, 90, 200, 300]
        //linkedHashSet.addAll(Arrays.asList(null)); --> NullPointerException
    }
}
