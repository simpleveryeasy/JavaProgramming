package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");//keys are duplicated last key accepted
        hashMap.put(5, "Ahmet");
        hashMap.put(6, "Ahmet");//values can be duplicated, keys must be unique
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");


        System.out.println("hashMap = " + hashMap);
        //hashMap = {null=Hulya, 3=Jack, 20=George, 5=Ahmet, 6=Ahmet, 7=null, 40=Emma, 8=null, 10=Arthur}


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");//keys are duplicated last key accepted
        linkedHashMap.put(5, "Ahmet");

        System.out.println("linkedHashMap = " + linkedHashMap);
        //linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Ahmet}

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");//keys are duplicated last key accepted
        treeMap.put(5, "Ahmet");


        System.out.println("treeMap = " + treeMap);//treeMap = {3=Jack, 5=Ahmet, 10=Arthur, 20=George, 40=Emma}

        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");//keys are duplicated last key accepted
        hashtable.put(5, "Ahmet");


        System.out.println("hashtable = " + hashtable);//hashtable = {10=Arthur, 20=George, 40=Emma, 5=Ahmet, 3=Jack}

    }
}
