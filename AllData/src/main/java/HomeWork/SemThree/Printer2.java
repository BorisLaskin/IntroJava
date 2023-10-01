package HomeWork.SemThree;

import java.util.*;

class Answer1 {
        public static void removeEvenNumbers(Integer[] arr){
        // Введите свое решение ниже
        List<Integer> answerList = new ArrayList<>(Arrays.asList(arr));
        answerList.removeIf(x -> x%2 == 0);
        System.out.println(answerList);

    }
//    public static void removeEvenNumbers(Integer[] arr) {
//        ArrayList<Integer> answerList  = new ArrayList<>();
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i]%2!=0) {
//                answerList.add(arr[i]);
//            }
//        }
//        System.out.println(answerList);
//    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer1 ans = new Answer1();
        ans.removeEvenNumbers(arr);
    }
}