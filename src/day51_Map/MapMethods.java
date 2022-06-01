package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);

        System.out.println("students.size() = " + students.size());//7
        System.out.println("students = " + students);
        //students = {Alex=96, Andriy=98, Aygun=85, Maria=95, Ozan=98, Serkan=97, Ali=87}

        //display the score of alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));//students.get("Alex") = 96

        //replace Ali's score to 90
        students.replace("Ali", 90);
        System.out.println("students = " + students);
        //students = {Alex=96, Andriy=98, Aygun=85, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Alex");
        System.out.println("students.size() = " + students.size());//students.size() = 6

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r1 = " + r1);//false
        System.out.println("r2 = " + r2);//true

        boolean r3 = students.containsValue(100);
        boolean r4 = students.containsValue(97);
        System.out.println("r3 = " + r3);//false
        System.out.println("r4 = " + r4);//true

        System.out.println("students.isEmpty() = " + students.isEmpty());//students.isEmpty() = false

        System.out.println("________________________________________");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1.equals(map2));//true

        map1.clear();
        map2.clear();
        System.out.println("map1 = " + map1);//map1 = {}
        System.out.println("map2 = " + map2);//map2 = {}


    }
}
