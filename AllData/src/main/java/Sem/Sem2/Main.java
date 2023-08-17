package Sem.Sem2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
//        method();
//        stringPool();

        String string = "abcdef";

        String upperCase = string.toUpperCase();
        byte[] bytes = string.getBytes(); // UTF8



//        char c = string.charAt(10);
//        System.out.println(c);

        char[] charArray = string.toCharArray();

        System.out.println(string.contains("abcdefg"));
        System.out.println(string.contains("abcabc"));

        int abc = string.indexOf("abc", 3);
        int bce = string.indexOf("bcd");

        System.out.println(abc);
        System.out.println(bce);

        System.out.println("".isEmpty());
        System.out.println("".isBlank());

        System.out.println(" ".isEmpty());
        System.out.println("     ".isBlank());

        String text = "abc a  d  dsas asd     fasdfdf, asdf   \\s+ ";
        String[] s = text.split("\\s");
        System.out.println(Arrays.toString(s));

        String replace = text.replace("\\s+", "__");
        String replaceFirst = text.replaceFirst("\\s+", "__");
        // [ ] [  ] [   ] [    ]
        String replaceAll = text.replaceAll("\\s+", " ");

        System.out.println(replace);
        System.out.println(replaceFirst);
        System.out.println(replaceAll);

        StringBuilder builder = new StringBuilder();
        StringBuilder asd = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abceefsdafa sdf afa fafd afa a sf af asfd safd ");
        stringBuilder.replace(0, 5, "-");
        stringBuilder.deleteCharAt(2);
        stringBuilder.insert(0, "_____");
        String result = stringBuilder.toString();
        System.out.println(result);


    }

    private static void stringPool() {
        // String pool (String table) [s1 = "abc"]

        // Неизменяемый Immutable
        // s1 -> ["abc"]
        String s1 = "abc";
        String s2 = "abc"; // s1
        String s3 = new String("abc");
        String s4 = new String("abc");
        s1 = s1 + s2; // "abcabc"

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }

    private static void method() {
//        int[] first = {1, 2, 3};
//        int second[] = {1, 2, 3};
//        int[] third = {1, 2, 3};

        Collection<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        boolean first = true;
        for (Integer x: ints) {
            if (first) {
                first = false;
                continue;
            }

        }
    }

}
