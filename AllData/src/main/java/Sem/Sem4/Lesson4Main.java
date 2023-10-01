package lesson4;

import java.util.*;

public class Lesson4Main {

    public static void main(String[] args) {

        // Map
        // add (push)
        // get (pop, pool, remove, ...)
        // Queue FIFO First In First Out
        // 1 2 3 4 -> 1 2 3 4

        // add (push)
        // get (pop, pool, remove, ...)
        // Stack LIFO Last In First Out

        // deque
        // add  1
        // add  2
        // add  3
        // add  4
        // add  5
        // poll -> 1
        // poll -> 2
        // pollFirst -> 3
        // pollLast -> 5

        // Parent
        // Child extends Parent
        // Child child = new Child();
        // Parent parent = new Child();

        // Queue Deque
        // addLast, removeLast

//        List<String> strings = new ArrayDeque<>();

        // ArrayList - список на основе массива
        // LinkedList - список И очередь на основе связаного списка
        // ArrayDeque - очередь на основе массиве

        // ["3", "4", null]
        // first = ["1"]
        // last = ["3"]
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.add("3");
        arrayDeque.remove();
        arrayDeque.remove();
        arrayDeque.add("4");

        // [[value, _prev, _next]]
        // [0] <-> [1] <-> [2] <-> [3] <-> [4] <-> ... <-> [10] <-> [11]
        List<String> linkedList = new LinkedList<>();
//        Deque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.addFirst(1);
//        arrayDeque.add(2);
//        arrayDeque.add(3);

        String s = linkedList.get(3);

        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        System.out.println(arrayDeque.removeFirst());
//        System.out.println(arrayDeque.remove());
//        System.out.println(arrayDeque.remove());
//        System.out.println(arrayDeque.remove());
//        System.out.println(arrayDeque.element());




    }

}
