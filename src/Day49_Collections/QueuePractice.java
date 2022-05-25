package Day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));//priorityQueue = [10, 40, 300, 200, 90]

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));//arrayDeque = [10, 200, 300, 40, 90]

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));//linkedList = [10, 200, 300, 40, 90]

        System.out.println("linkedList = " + linkedList);

        System.out.println("__________________________________________");

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);//[40, 90, 300, 200]


        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);//[200, 300, 40, 90]

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);//[200, 300, 40, 90]

        System.out.println("__________________________________________");

        //priorityQueue.get(1);
        //arrayDeque.get(1);

        ((LinkedList<Integer>) linkedList).get(1);

    }
}
