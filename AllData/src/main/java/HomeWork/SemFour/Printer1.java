package HomeWork.SemFour;

import java.util.LinkedList;

class LLTasks {
    private static final LinkedList<Object> data = new LinkedList<Object>();

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        try {
            while (true) {
                data.add(ll.removeLast());
            }
        } catch (Exception e) {
        }

        return data;
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}