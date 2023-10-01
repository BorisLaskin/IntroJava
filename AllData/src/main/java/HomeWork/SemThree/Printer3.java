package HomeWork.SemThree;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        Arrays.sort(arr);
        IntSummaryStatistics stats = Arrays.asList(arr)
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is "+arr[0]);
        System.out.println("Maximum is "+arr[arr.length-1]);
        System.out.println("Average is = "+(int)stats.getAverage());
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}