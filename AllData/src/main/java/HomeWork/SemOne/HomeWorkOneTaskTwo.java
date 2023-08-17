package HomeWork.SemOne;

import java.util.ArrayList;

class TWO {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        int limit = 1000;
        ArrayList<Integer> resultNumbers = new ArrayList<>();
        ArrayList<Integer> badNumbers = new ArrayList<>();
        System.out.println(1);
        resultNumbers.add(1);
        for (int i = 2; i <= limit; i++) {
            if (badNumbers.contains(i)) {continue;}
            else {
                resultNumbers.add(i);
                System.out.println(i);
                int j=1;
                while (i*j<=limit) {
                    badNumbers.add(i*j);
                    j++;
                }
            }

        }

    }
}

public class HomeWorkOneTaskTwo {
    public static void main(String[] args) {

        TWO ans = new TWO();
        ans.printPrimeNums();
    }
}

