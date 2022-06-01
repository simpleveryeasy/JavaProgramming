package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice2 {

    public static void main(String[] args) {

//Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    //1.1 who has the maximum salary?
        int maxSalary = Integer.MIN_VALUE;
        String nameMax = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxSalary){
                maxSalary = entry.getValue();
                nameMax = entry.getKey();
            }
        }
        System.out.println(nameMax + " : " + maxSalary);

    //1.2 who has the minimum salary?
        int minSalary = Integer.MAX_VALUE;
        String nameMin = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minSalary){
                minSalary = entry.getValue();
                nameMin = entry.getKey();
            }
        }
        System.out.println(nameMin + " : " + minSalary);

        //1.3 how many employees has the salary between 120k ~ 150K?

        int count = 0;
        for (Integer value : map.values()) {
            if (value >= 120000 && value <= 150000){
                count++;
            }
        }
        System.out.println("count = " + count);


        //1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 118000){
                System.out.println(entry.getKey());
            }
        }


        //1.5 increase the salary of each employee(if less than 120000) by 10K
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 120000) {
                entry.setValue(entry.getValue() + 10000);
                System.out.println(entry.getValue());
            }
        }

    }
}
