package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);// [100, 200, 200, 200, 300, 400, 500]
/*
        int num = 1;
        list.remove(num);
        System.out.println(list);// [100, 200, 200, 300, 400, 500]

*/
        Integer num = 200;
        boolean r = list.remove(num);
        System.out.println(list);// [100, 200, 200, 300, 400, 500]
        System.out.println("r = " + r);// r = true
        Integer num1 = 2000;
        boolean r1 = list.remove(num1);
        System.out.println("r1 = " + r1);// r1 = false

        System.out.println("________________________________________");

        System.out.println(list.size());// 6
        list.clear();
        System.out.println(list.size());// 0

        System.out.println("________________________________________");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');// 0
        System.out.println("a = " + a);
        int b = characters.lastIndexOf('A');// 4
        System.out.println("b = " + b);

        System.out.println("________________________________________");

        boolean r2 = characters.contains('A');
        System.out.println("r2 = " + r2);// r2 = true

        boolean r3 = characters.contains('Z');
        System.out.println("r3 = " + r3);// r3 = false
















    }
}
