package lesson5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tasks {

    public static void main(String[] args) {
        countAndPrint(List.of("1", "2", "2", "4", "3", "1", "4", "5", "2"));

        System.out.println(isIsomorphic("abc", "abc")); // true
        System.out.println(isIsomorphic("abc", "bce")); // true
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("add", "egg")); // true
        System.out.println(isIsomorphic("note", "code")); // true
        System.out.println(isIsomorphic("abcde", "aaaaa")); // true
        System.out.println(isIsomorphic("aaaaa", "abcde")); // false
    }

    /**
     * Проверить, что 2 строки являются изоморфными.
     * <p>
     * abc, abc -> true // a -> a, b -> b, c -> c
     * abc, bce -> true // a -> b, b -> c, c -> e
     * paper, title -> true // p -> t, a -> i, e -> l, r -> e
     * foo, bar -> false // f -> b, o -> a, o -> XXX
     * add, egg -> true // a -> e, d -> g
     * note, code -> true
     * abcde, aaaaa -> true // a, b, c, d, e -> a
     * aaaaa, abcde -> false //
     */
    private static boolean isIsomorphic(String first, String second) {
        // int -> Integer, char -> Character, long -> Long
        Map<Character, Character> mapping = new HashMap<>();

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length != secondChars.length) {
            return false;
        }


        for (int i = 0; i < firstChars.length; i++) {
            char firstChar = firstChars[i];   // o
            char secondChar = secondChars[i]; // r

            if (mapping.containsKey(firstChar)) {
                Character prevChar = mapping.get(firstChar); // a
                if (prevChar != secondChar) {
                    return false;
                }
            } else {
                mapping.put(firstChar, secondChar);
            }
        }
        return true;
    }

    /**
     * Вывести статистику повторений внутри списка
     * "1", "2", "2", "4", "3", "1", "4", "5", "2"
     * "1" -> 2
     * "2" -> 3
     * "3" -> 1
     * "4" -> 2
     * "5" -> 1
     * Формат вывода статистики любой.
     */
    private static void countAndPrint(List<String> values) {
        Map<String, Integer> stats = new HashMap<>();
        for (String value : values) {
            if (stats.containsKey(value)) {
                Integer oldValue = stats.get(value); // старое значение
                stats.put(value, oldValue + 1);
            } else {
                stats.put(value, 1);
            }
        }
        System.out.println(stats);
    }

}
