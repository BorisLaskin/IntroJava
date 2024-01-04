package lesson5;

import java.util.*;

public class Lesson5Main {

    public static void main(String[] args) {
        // HashMap
        // [null, null, null, null, ... null] = 16
        // hashMap.put(key, value)
        // key_hash = hash(key) - вычисляется числовой хеш ключа
        // if (0 < key_hash < 16) => [key_hash]
        // else [key_hash % 16]
        // [null, null, (key, value), null, ... null] = 16
        // hashMap.put(key2, value2)
        // key2_hash = hash(key2)
        // Предполжим, что key2_hash = key_hash
        // [null, null, [(key, value), (key2, value2)], null, ... null] = 16
        // loadFactor = 75%

        // TreeMap
        //

//        Object

        // LinkedHashMap
        //

        Map<Integer, String> hashMap = new LinkedHashMap<>();

        hashMap.put(4, "value4");
        hashMap.put(1, "value1");
        hashMap.put(3, "value3");
        hashMap.put(1, "value0");
        hashMap.put(2, "value2");

        System.out.println(hashMap);

        String value = hashMap.get(1);

//        hashMap.remove(3);

//        System.out.println(hashMap.containsKey(1)); // true
//        System.out.println(hashMap.containsKey(5)); // false
//        System.out.println(hashMap.containsKey(3)); // false
//
//
//        Map<Person, String> personStringMap = new TreeMap<>();
//        personStringMap.put(new Person("Igor1"), "1");
//        personStringMap.put(new Person("Igor2"), "2");
//        personStringMap.put(new Person("Igor3"), "3");
//        personStringMap.put(new Person("Igor4"), "4");
//
//        System.out.println(personStringMap);

    }

    static class Person implements Comparable<Person> {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return name.compareTo(o.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
