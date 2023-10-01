package lesson4;

import java.util.LinkedList;

public class Homework {

    LinkedList<Integer> results = new LinkedList<>();

    public int calculate(char op, int a, int b) {


        int res = switch (op) {
            case '+' -> a + b;
            default -> results.get(0); // <
        };


//        // Напишите свое решение ниже
//        int res = -1;
//        switch (op) {
//            case '+':
//                res = 1;
//                break;
//            // ...
//            case '<':
//                res = // вычислить предпоследнюю из списка
//
//        }
//        ;


        results.add(res);
        return res;
    }

    /**
     * calculate('+', 3, 7)
     * calculate('+', 4, 7)
     * calculate('+', 1, 2)
     * calculate('+', 0, 0)
     * calculate('-', 8, 4)
     * calculate('<', 0, 0)
     * calculate('<', 0, 0)
     * calculate('<', 0, 0)
     *
     * 10
     * 11
     * 3
     * 0
     * 4
     * 0
     * 4
     * 0
     */

}
