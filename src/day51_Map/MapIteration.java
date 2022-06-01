package day51_Map;

import java.util.*;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

        //Set<String> keys = students.keySet();

        /*
        for (String eachKey : keys) {
            System.out.println(eachKey + " : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }
        */
        /*
        keys.removeIf(p -> students.get(p) < 90);
        System.out.println(students);
         */

        Map<String, Integer> earlyBirds = new HashMap<>(); //score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value  =  students.get(key);

            if (value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        /*
        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue < 90) {
                System.out.println(eachKey);
            }
        }
         */

        System.out.println("_______________________________");

        //Collection<Integer> scores = students.values();

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println(scores);//[80, 98, 95, 90, 75, 70, 85]

        for (Integer scoresvalue : students.values()) {
            System.out.println(scoresvalue);
        }

        System.out.println("____________________________________________");

       int maxScore = Integer.MIN_VALUE;
       int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score > maxScore){
                maxScore = score;
            }
            if (score < minScore){
                minScore = score;
            }
        }
        System.out.println(maxScore);//98
        System.out.println(minScore);//70

        System.out.println("____________________________________________");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());
        System.out.println(max);//98
        System.out.println(min);//70

        System.out.println("____________________________________________");

        // how many students as the score of 95 or greater

        int count = 0;
        for (Integer value : students.values()) {
            if (value >= 95){
                count++;
            }
        }
        System.out.println(count);//2

        int count1 = 0;
        for (String str : students.keySet()) {
            if (students.get(str) >= 95){
                count1++;
            }
        }
        System.out.println(count1);//2

        System.out.println("____________________________________________");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
