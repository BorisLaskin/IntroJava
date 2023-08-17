package HomeWork.SemFive;

import java.util.*;

public class Homework {

    /**
     * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
     * Регистр слова не имеет значения. Формат вывода произвольный.
     * Программа-минимум:
     * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
     * 2. Точки и запятые не должны входить в статистику.
     * <p>
     * Доп. задание
     * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
     * <p>
     * Пример:
     * <p>
     * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB.
     * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
     * <p>
     * 1 -> [и, в]
     * 2 -> [он, из, gb, не]
     * 3 -> [мой, для]
     * 4 -> [слов, того, себе]
     * 5 -> [текст, нужен, чтобы, несет, набор]
     * ...
     */
    static void printStats(String text) {
        String empty = "";
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        String temp = text.replace(",", empty).replace(".", empty)
                .replace(" - ", " ").replaceAll("\\s+", " ").toLowerCase();
        // 2. Сбор структуры со статистикой.
        Map<Integer, LinkedList<String>> stats = new HashMap<>(); // Структура, в которой ключ - длина слова, значение - список таких слов.
        String[] stringData = temp.split(" ");
        for (String item : stringData) {
            int len = item.length();
            if (item.contains("-")) {
                len-=1;
            }
            if (len > 0) {
                stats.putIfAbsent(len, new LinkedList<String>());

                var linkNode = stats.get(len);
                linkNode.add(item);
            }
        }

        for (var item: stats.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue().toString());
            //System.out.println(item.getKey() + ": " + item.getValue().toArray().length);
        }

    }

    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStats(text);
    }
}