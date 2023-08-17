package Sem.Sem1;
/*
 * Дан массив nums = [3,2,2,3] и число val = 3
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * таким образом, первые несколько элементов массива должны быть отличны от заданного,
 * а остальные - равные ему
 * */

import java.util.Arrays;
import java.util.Random;

public class taskTwo {
    public static void main(String[] args) {
        int NumLength = 10;
        int maxIntYouWant = 5;
        Random r = new Random();
        int value = 4;
        int[] nums = new int[]{1,3,4,5,3,2,3,4,4};
//        int value = r.nextInt(maxIntYouWant) + 1;
//        int[] nums = new int[NumLength];
//        for (int i = 0; i < NumLength; i++) nums[i] = r.nextInt(maxIntYouWant) + 1;
        String res = String.format("Исходное число для поиска: %d", value);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
        int counter = 0;
        int i = 0;
        while (i < nums.length - counter) {
            if (nums[i] == value) {
                nums[i] = nums[nums.length - counter - 1];
                nums[nums.length - counter - 1] = value;
                counter++;
            }
            else i++;

        }

        System.out.println("i = " + i);
        System.out.println(Arrays.toString(nums));
    }

}
