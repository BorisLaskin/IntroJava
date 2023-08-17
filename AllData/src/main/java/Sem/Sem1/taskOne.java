package Sem.Sem1;

//дан массив двоичных чисел. Вывести максимальное число идущих подряд единиц
public class taskOne {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1};
        int maxLength = 0;
        int currentLength = 0;

        int i = 0;
        do {
            if (i< arr.length && arr[i] == 1)
                currentLength++;
            else {
                maxLength = maxLength <= currentLength ? currentLength : maxLength;
                currentLength = 0;
            }
            i++;
        }while (i <=arr.length);

//        String res = String.format("MaxLength: %d", maxLength);
//        System.out.println(res);
        System.out.println("MaxLength: " + maxLength);
    }
}
