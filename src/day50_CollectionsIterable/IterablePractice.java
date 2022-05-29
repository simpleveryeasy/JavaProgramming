package day50_CollectionsIterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements less than 4


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);//[2, 4, 5, 2, 4, 5, 2, 4, 5] does not work properly

        System.out.println("__________________________________");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //remove all the elements less than 4

        Iterator<Integer> it = list2.iterator();
        boolean r1 = it.hasNext();
        System.out.println("r1 = " + r1);//r1 = true

        //System.out.println(it.next());//1
        //System.out.println(it.next());//2

        while(it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }
        System.out.println("list2 = " + list2);//list2 = [4, 5, 4, 5, 4, 5]

        System.out.println("__________________________________");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ){
            if (i.next() < 4){
                i.remove();
            }
        }
        System.out.println("list3 = " + list3);//list3 = [4, 5, 4, 5, 4, 5]

        System.out.println("__________________________________");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each -> each<4);
        System.out.println("list4 = " + list4);//list4 = [4, 5, 4, 5, 4, 5]



    }
}
